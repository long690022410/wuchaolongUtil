package com.chaolong.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			int random = RandomUtil.random(1,10);
			System.out.println(random);
		}
	}

	@Test
	public void testSubRandom() {
		int[] subRandom = RandomUtil.subRandom(1, 10, 3);
		for (int i = 0; i < subRandom.length; i++) {
			System.out.println(subRandom[i]);
		}
	}

	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 20; i++) {
			char c = RandomUtil.randomCharacter();
			System.out.print(c+"--");
		}
	}

	@Test
	public void testRandomString() {
		String s = RandomUtil.randomString(5);
		System.out.println(s);
	}

}
