package com.chaolong.utils;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: �������������
 * @author: wuchaolong
 * @date: 2020��4��23�� ����10:44:09
 */
public class RandomUtil {
	
	/**
	 * 
	 * @Title: random 
	 * @Description: ����min-max֮����������������min��maxֵ��
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
		Random random = new Random();
		int i = random.nextInt(max - min +1);
		
		
		return i + min;
	}
	/**
	 * 
	 * @Title: subRandom 
	 * @Description: ����Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ��������
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
		HashSet<Integer> set = new HashSet<>();
		do {
			int i = random(min,max);
			set.add(i);
		}while(set.size() != subs);
		int arr[] = new int[subs] ;
		int i = 0;
		for (Integer integer : set) {
			arr[i] = integer;
			i++;
		}
		return arr;
	}
	/**
	 * 
	 * @Title: randomCharacter 
	 * @Description: ����1��1-9,a-Z֮�������ַ�
	 * @return
	 * @return: char
	 */
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
		int i = random(1,3);
		char c = 0;
		switch (i) {
		case 1:
			c = (char) random(48,57);
			break;
		case 2:
			c = (char) random(65,90);
			break;
		case 3:
			c = (char) random(97,122);
			break;
		}
		return c;
	}
	/**
	 * 
	 * @Title: randomString 
	 * @Description: ���ز���length���ַ���
	 * @param length
	 * @return
	 * @return: String
	 */
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		String s = "";
		for (int i = 0; i < length; i++) {
			s += randomCharacter();
		}
		
		return s;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
