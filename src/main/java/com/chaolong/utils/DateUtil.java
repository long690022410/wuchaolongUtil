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
	/**
	 * 
	 * @Title: transitionDateToString 
	 * @Description: 将Date对象转化为字符串 格式为yyyy-MM-dd
	 * @param date
	 * @return
	 * @return: String
	 */
	public static String transitionDateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(date);
		return format;
	}
	/**
	 * 
	 * @Title: getBenginningOfMonth 
	 * @Description: 根据传入的日期返回这个日期的月初
	 * @param date 
	 * @return
	 * @return: Date
	 */
	
	public static Date getBenginMonth(Date date) {
		// 实例化一个日历类
		Calendar cal = Calendar.getInstance();
		// 传进来的参数初始化日历类
		cal.setTime(date);
		// 改变日期 为这个月的第一天
		cal.set(Calendar.DAY_OF_MONTH, 1);
		// 将时间设置为0时0分0秒
		cal.set(Calendar.HOUR_OF_DAY, 0);//小时
		cal.set(Calendar.MINUTE, 0);//分钟
		cal.set(Calendar.SECOND, 0);//秒
		return cal.getTime();
	}
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 根据传入日期返回传入日期的月末
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		// 月份+1
		cal.add(Calendar.MONTH, 1);
		// 获得该月的月初
		Date benginMonth = getBenginMonth(cal.getTime());
		//将日历初始化为下个月的第一天
		cal.setTime(benginMonth);
		// 减一秒  即为这个月的月末
		cal.add(Calendar.SECOND, -1);
		return cal.getTime();
	}
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: 根据生日返回年龄   如果返回-1 传入生日错误
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date birthday) {
		Calendar cal = Calendar.getInstance();
		
		int nowYear = cal.get(Calendar.YEAR);// 得到现在的年份
		int nowMonth = cal.get(Calendar.MONTH);// 得到现在的月份
		int nowDay = cal.get(Calendar.DAY_OF_MONTH);//得到现在的日期
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(birthday);
		int birthdayYear =  cal2.get(Calendar.YEAR);// 得到生日的年份
		int birthdayMonth = cal2.get(Calendar.MONTH);// 得到生日的月份
		int birthdayDay = cal2.get(Calendar.DAY_OF_MONTH);//得到生日的日期
		if(nowYear < birthdayYear) {
			return -1;
		}
		int age = nowYear - birthdayYear;
		if(nowMonth < birthdayMonth)
			age--;// 生日月份小  年龄-1
		if(nowMonth == birthdayMonth && nowDay < birthdayDay)
			age--;//如果月份相同 判断日期 没过生日 年龄-1
		
		return age;
	}
	
	
}
