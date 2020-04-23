package com.chaolong.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: ���ڹ�����
 * @author: wuchaolong
 * @date: 2020��4��23�� ����4:38:36
 */
public class DateUtil {
	/**
	 * 
	 * @Title: random 
	 * @Description: ����һ��������Сʱ������ʱ��֮���ʱ��
	 * @param min ��Сʱ��
	 * @param max ���ʱ��
	 * @return
	 * @return: Date
	 */
	public static Date random(Date min,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
		long t = (long) (Math.random() * (t2 -t1) + t1);
		return new Date(t);
		
	}
	
	public static String transitionDateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		return format;
	}
	
}
