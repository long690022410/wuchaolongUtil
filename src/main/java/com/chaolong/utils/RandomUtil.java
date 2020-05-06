package com.chaolong.utils;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数处理工具类
 * @author: wuchaolong
 * @date: 2020年4月23日 上午10:44:09
 */
public class RandomUtil {
	
	/**
	 * 
	 * @Title: random 
	 * @Description: 返回min-max之间的随机整数（包含min和max值）
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		Random random = new Random();
		int i = random.nextInt(max - min +1);
		
		
		return i + min;
	}
	/**
	 * 
	 * @Title: subRandom 
	 * @Description: 在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
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
	 * @Description: 返回1个1-9,a-Z之间的随机字符
	 * @return
	 * @return: char
	 */
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
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
	 * @Description: 返回参数length个字符串
	 * @param length
	 * @return
	 * @return: String
	 */
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String s = "";
		for (int i = 0; i < length; i++) {
			s += randomCharacter();
		}
		
		return s;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
