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

}
