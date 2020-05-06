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
			AssertUtil.isTrue(10>3, "10������3");
			AssertUtil.isTrue(10<3, "10��С��3");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ˣ�����ϵ����Ա");
		}
		
	}

	@Test
	public void testIsFalse() {
		try {
			AssertUtil.isFalse(10<3, "10С��3");
			AssertUtil.isFalse(10>3, "10����3");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ˣ�����ϵ����Ա");
		}
	}

	@Test
	public void testNotNull() {
		try {
			
			AssertUtil.notNull(new String(), "������Ϊ��2");
			AssertUtil.notNull(null, "������Ϊ��1");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ˣ�����ϵ����Ա");
		}
	}

	@Test
	public void testIsNull() {
		try {
			AssertUtil.isNull(null, "�������Ϊ��1");
			AssertUtil.isNull(new String(), "�������Ϊ��2");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ˣ�����ϵ����Ա");
		}
	}

	@Test
	public void testNotEmptyCollectionOfQString() {
		try {
			ArrayList<String> list = new ArrayList<String>();
			list.add("12");
			AssertUtil.notEmpty(list, "collection����Ϊ��2");
			AssertUtil.notEmpty(new ArrayList<String>(), "collection����Ϊ��1");
			
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ˣ�����ϵ����Ա");
		}
	}

	@Test
	public void testNotEmptyMapOfQQString() {
		try {
			HashMap<Object, Object> map = new HashMap<>();
			map.put("1", "1");
			AssertUtil.notEmpty(map, "map����Ϊ��2");
			AssertUtil.notEmpty(new HashMap<>(), "map����Ϊ��1");
			
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ˣ�����ϵ����Ա");
		}
	}

	@Test
	public void testHasText() {
		try {
			AssertUtil.hasText("", "�û�������Ϊ��1");
			AssertUtil.hasText("ss", "�û�������Ϊ��2");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ˣ�����ϵ����Ա");
		}
	}

	@Test
	public void testGreaterThanZero() {
		try {
			AssertUtil.greaterThanZero(new BigDecimal(100), "100ֵ����С�ڵ���0");
			AssertUtil.greaterThanZero(new BigDecimal(0), "0ֵ����С�ڵ���0");
		} catch (AssertException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ˣ�����ϵ����Ա");
		}
	}

}
