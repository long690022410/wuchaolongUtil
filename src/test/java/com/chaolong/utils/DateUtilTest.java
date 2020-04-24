package com.chaolong.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void test() {
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 0, 1);
		Date random = DateUtil.random(cal.getTime(), new Date());
		System.out.println(random);
		String string = DateUtil.transitionDateToString(random);
		System.out.println(string);
		
		
		
		
	}
	@Test
	public void personTest() {
		for (int i = 0; i < 10000; i++) {
			Person p = new Person();
			// 生成姓名
			p.setName(StringUtil.generateChineseName());
			// 生成年龄 1-120岁之间
			p.setAge(RandomUtil.random(1, 120));
			// 生成介绍属性  随机140个汉字
			p.setAbout(StringUtil.randomChineseString(140));
			// 注册日期 2010年1月1日至今
			Calendar cal = Calendar.getInstance();
			cal.set(2010, 0, 1);
			p.setCreated(DateUtil.random(cal.getTime(), new Date()));
			
			System.out.println(i+1+"--"+p);
			
		}
	}
	@Test
	public void getBenginMonthTest() {
		Date date = DateUtil.getBenginMonth(new Date());
		
		System.out.println(DateUtil.transitionDateToString(date));
	}
	
	@Test
	public void getEndMonthTest() {
		Date date = DateUtil.getEndMonth(new Date());
		
		System.out.println(DateUtil.transitionDateToString(date));
	}
	@Test
	public void getAgeByBirthdayTest() {
		Calendar cal = Calendar.getInstance();
		cal.set(2000, 3, 25);
		int age = DateUtil.getAgeByBirthday(cal.getTime());
		System.out.println(age);
	}
}
