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
			// ��������
			p.setName(StringUtil.generateChineseName());
			// �������� 1-120��֮��
			p.setAge(RandomUtil.random(1, 120));
			// ���ɽ�������  ���140������
			p.setAbout(StringUtil.randomChineseString(140));
			// ע������ 2010��1��1������
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
