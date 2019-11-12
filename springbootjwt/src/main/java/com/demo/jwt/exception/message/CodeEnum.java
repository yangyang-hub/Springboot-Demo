package com.demo.jwt.exception.message;

public enum CodeEnum {

	ILLEGALTOKEN(110000,"非法token！"),
	EXPIRETOKEN(110001,"token已经过期！"),
	TOKENISEMPTY(110002,"Token 不能为空");
	
	
	private CodeEnum(Integer code,String msg){
		this.code = code;
		this.msg = msg;
	}
	private Integer code;
	private String msg;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}