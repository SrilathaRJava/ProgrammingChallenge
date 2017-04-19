package com.codetest.programchallenge2.b;

public class NoDataException  extends Exception{
	private static final long serialVersionUID = 1L;
	
	private int errorCode;
	private String errorMsg;
	
	public NoDataException(int errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
