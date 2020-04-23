package com.chaolong.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: wuchaolong
 * @date: 2020年4月23日 下午4:38:36
 */
public class DateUtil {
	/**
	 * 
	 * @Title: random 
	 * @Description: 生成一个处于最小时间和最大时间之间的时间
	 * @param min 最小时间
	 * @param max 最大时间
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
