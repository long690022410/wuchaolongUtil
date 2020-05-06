package com.chaolong.exception;
/**
 * 
 * @ClassName: AssertException 
 * @Description: �Լ����쳣��
 * @author: wuchaolong
 * @date: 2020��4��26�� ����10:52:52
 */
public class AssertException extends RuntimeException{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public AssertException() {
		super();
	}
	public AssertException(String message) {
		super(message);
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
