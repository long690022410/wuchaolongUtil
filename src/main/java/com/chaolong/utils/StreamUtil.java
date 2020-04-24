package com.chaolong.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: ��������
 * @author: wuchaolong
 * @date: 2020��4��24�� ����3:55:06
 */
public class StreamUtil {
	
	
	/**
	 * 
	 * @Title: closeAll 
	 * @Description: �����ر��� 
	 * @param autoCloseables �����ʵ��autoCloseable�ӿڵĶ���
	 * @return: void
	 */
	public static void closeAll(AutoCloseable ...autoCloseables) {
		for (AutoCloseable autoCloseable : autoCloseables) {
			if(autoCloseable != null ) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	/**
	 * 
	 * @Title: readTextFile 
	 * @Description: ����һ�������� ��ȡ���� Ĭ�ϱ���ΪUTF-8
	 * @param in ������
	 * @return
	 * @throws IOException
	 * @return: String
	 */
	public static String readTextFile(InputStream in) {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String str = "";
		String str1 = "";
		try {
			while((str = br.readLine()) != null) {
				str1 += str;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(br);
		}
		
		
		return str1;
	}
	/**
	 * 
	 * @Title: readTextFile 
	 * @Description: ����һ���ļ� ��ȡ���������
	 * @param file �ļ�
	 * @return
	 * @return: String
	 */
	public static String readTextFile(File file) {
		String str = "";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			str = readTextFile(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			closeAll(fis);
		}
		
		return str;
	}
	/**
	 * 
	 * @Title: readTextFileToList 
	 * @Description: ��ÿһ�ж�ȡ�ļ�������   
	 * @param file
	 * @return
	 * @return: List<String>
	 */
	
	public static List<String> readTextFileToList(File file){
		List<String> list = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String str = "";
			while((str = br.readLine()) != null) {
				list.add(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//closeAll(br);
		}
		
		
		return list;
	}
	
	
	
	
	
}
