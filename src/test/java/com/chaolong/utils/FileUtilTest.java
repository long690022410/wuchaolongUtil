package com.chaolong.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String fileName = "aa.a.text";
		System.out.println(FileUtil.getExtendName(fileName));
		
	}

	@Test
	public void testGetTempDirectory() {
		
		System.out.println(FileUtil.getTempDirectory());
	}

	@Test
	public void testGetUserDirectory() {
		System.out.println(FileUtil.getUserDirectory());
	}

}
