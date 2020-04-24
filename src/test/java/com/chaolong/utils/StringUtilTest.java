package com.chaolong.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String s = "  ";
		System.out.println(StringUtil.hasLength(s));
		
	}

	@Test
	public void testHasText() {
		String s = "  ";
		System.out.println(StringUtil.hasText(s));
	}

	@Test
	public void testRandomChineseString() {
		for (int i = 0; i < 40; i++) {
			String str = StringUtil.randomChineseString(2);
			System.out.println(str);
		}
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 40; i++) {
			String str = StringUtil.generateChineseName();
			System.out.println(str);
		}
	}
	
	@Test
	public void test() {
		String str = "1a1.1";
		System.out.println(StringUtil.isNumber(str));
		String email = "cuiqiang@112163";
		System.out.println(StringUtil.isEMail(email));
		String phone = "133555555555";
		System.out.println(StringUtil.isPhone(phone));
	}
	
}
