package com.chaolong.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException, IOException {
		String path = "F:\\maven\\hello.txt";
		String string = StreamUtil.readTextFile(new FileInputStream(new File(path)));
		System.out.println(string);
	}
	@Test
	public void testReadTextFileToList() {
		String path = "F:\\maven\\hello.txt";
		List<String> list = StreamUtil.readTextFileToList(new File(path));
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	
	
	
	
}
