package com.chaolong.utils;

import java.io.File;

/**
 * 
 * @ClassName: FileUtil 
 * @Description: 文件工具类
 * @author: wuchaolong
 * @date: 2020年4月24日 下午3:55:23
 */
public class FileUtil {
	/**
	 * 
	 * @Title: getExtendName 
	 * @Description: 给定一个文件名 返回该文件名的扩展名
	 * @param fileName
	 * @return
	 * @return: String
	 */
	public static String getExtendName(String fileName){
		if(null == fileName)
			throw new RuntimeException("文件名不能为空");
		if(!StringUtil.hasText(fileName) || !fileName.contains("."))
			throw new RuntimeException("不是文件");
		
		return fileName.substring(fileName.lastIndexOf("."));
	}
	/**
	 * 
	 * @Title: getTempDirectory 
	 * @Description: 返回系统临时目录
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
	 * @Description: 返回操作系统用户目录
	 * @return
	 * @return: File
	 */
	public static File getUserDirectory(){
		String path = System.getProperty("user.home");
		return new File(path);
	}
	
	
	
	
}
