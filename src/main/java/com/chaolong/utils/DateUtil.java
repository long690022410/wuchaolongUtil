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
	/**
	 * 
	 * @Title: transitionDateToString 
	 * @Description: ��Date����ת��Ϊ�ַ��� ��ʽΪyyyy-MM-dd
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
	 * @Description: ���ݴ�������ڷ���������ڵ��³�
	 * @param date 
	 * @return
	 * @return: Date
	 */
	
	public static Date getBenginMonth(Date date) {
		// ʵ����һ��������
		Calendar cal = Calendar.getInstance();
		// �������Ĳ�����ʼ��������
		cal.setTime(date);
		// �ı����� Ϊ����µĵ�һ��
		cal.set(Calendar.DAY_OF_MONTH, 1);
		// ��ʱ������Ϊ0ʱ0��0��
		cal.set(Calendar.HOUR_OF_DAY, 0);//Сʱ
		cal.set(Calendar.MINUTE, 0);//����
		cal.set(Calendar.SECOND, 0);//��
		return cal.getTime();
	}
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: ���ݴ������ڷ��ش������ڵ���ĩ
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		// �·�+1
		cal.add(Calendar.MONTH, 1);
		// ��ø��µ��³�
		Date benginMonth = getBenginMonth(cal.getTime());
		//��������ʼ��Ϊ�¸��µĵ�һ��
		cal.setTime(benginMonth);
		// ��һ��  ��Ϊ����µ���ĩ
		cal.add(Calendar.SECOND, -1);
		return cal.getTime();
	}
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: �������շ�������   �������-1 �������մ���
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date birthday) {
		Calendar cal = Calendar.getInstance();
		
		int nowYear = cal.get(Calendar.YEAR);// �õ����ڵ����
		int nowMonth = cal.get(Calendar.MONTH);// �õ����ڵ��·�
		int nowDay = cal.get(Calendar.DAY_OF_MONTH);//�õ����ڵ�����
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(birthday);
		int birthdayYear =  cal2.get(Calendar.YEAR);// �õ����յ����
		int birthdayMonth = cal2.get(Calendar.MONTH);// �õ����յ��·�
		int birthdayDay = cal2.get(Calendar.DAY_OF_MONTH);//�õ����յ�����
		if(nowYear < birthdayYear) {
			return -1;
		}
		int age = nowYear - birthdayYear;
		if(nowMonth < birthdayMonth)
			age--;// �����·�С  ����-1
		if(nowMonth == birthdayMonth && nowDay < birthdayDay)
			age--;//����·���ͬ �ж����� û������ ����-1
		
		return age;
	}
	
	
}
