package com.chaolong.utils;

import java.io.File;

/**
 * 
 * @ClassName: FileUtil 
 * @Description: �ļ�������
 * @author: wuchaolong
 * @date: 2020��4��24�� ����3:55:23
 */
public class FileUtil {
	/**
	 * 
	 * @Title: getExtendName 
	 * @Description: ����һ���ļ��� ���ظ��ļ�������չ��
	 * @param fileName
	 * @return
	 * @return: String
	 */
	public static String getExtendName(String fileName){
		if(null == fileName)
			throw new RuntimeException("�ļ�������Ϊ��");
		if(!StringUtil.hasText(fileName) || !fileName.contains("."))
			throw new RuntimeException("�����ļ�");
		
		return fileName.substring(fileName.lastIndexOf("."));
	}
	/**
	 * 
	 * @Title: getTempDirectory 
	 * @Description: ����ϵͳ��ʱĿ¼
	 * @return
	 * @return: File
	 */
	public static File getTempDirectory(){
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	/**
	 * 
	 * @Title: getUserDirectory 
	 * @Description: ���ز���ϵͳ�û�Ŀ¼
	 * @return
	 * @return: File
	 */
	public static File getUserDirectory(){
		String path = System.getProperty("user.home");
		return new File(path);
	}
	
	
	
	
}
