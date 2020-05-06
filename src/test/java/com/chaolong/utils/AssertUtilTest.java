package com.chaolong.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.chaolong.exception.AssertException;

public class AssertUtilTest {

	@Test
	public void testIsTrue() {
		try {
			AssertUtil.isTrue(10>3, "10不大于3");
			AssertUtil.isTrue(10<3, "10不小于3");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序崩溃了，快联系管理员");
		}
		
	}

	@Test
	public void testIsFalse() {
		try {
			AssertUtil.isFalse(10<3, "10小于3");
			AssertUtil.isFalse(10>3, "10大于3");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序崩溃了，快联系管理员");
		}
	}

	@Test
	public void testNotNull() {
		try {
			
			AssertUtil.notNull(new String(), "对象不能为空2");
			AssertUtil.notNull(null, "对象不能为空1");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序崩溃了，快联系管理员");
		}
	}

	@Test
	public void testIsNull() {
		try {
			AssertUtil.isNull(null, "对象必须为空1");
			AssertUtil.isNull(new String(), "对象必须为空2");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序崩溃了，快联系管理员");
		}
	}

	@Test
	public void testNotEmptyCollectionOfQString() {
		try {
			ArrayList<String> list = new ArrayList<String>();
			list.add("12");
			AssertUtil.notEmpty(list, "collection不能为空2");
			AssertUtil.notEmpty(new ArrayList<String>(), "collection不能为空1");
			
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序崩溃了，快联系管理员");
		}
	}

	@Test
	public void testNotEmptyMapOfQQString() {
		try {
			HashMap<Object, Object> map = new HashMap<>();
			map.put("1", "1");
			AssertUtil.notEmpty(map, "map不能为空2");
			AssertUtil.notEmpty(new HashMap<>(), "map不能为空1");
			
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序崩溃了，快联系管理员");
		}
	}

	@Test
	public void testHasText() {
		try {
			AssertUtil.hasText("", "用户名不能为空1");
			AssertUtil.hasText("ss", "用户名不能为空2");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序崩溃了，快联系管理员");
		}
	}

	@Test
	public void testGreaterThanZero() {
		try {
			AssertUtil.greaterThanZero(new BigDecimal(100), "100值不能小于等于0");
			AssertUtil.greaterThanZero(new BigDecimal(0), "0值不能小于等于0");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序崩溃了，快联系管理员");
		}
	}

}
