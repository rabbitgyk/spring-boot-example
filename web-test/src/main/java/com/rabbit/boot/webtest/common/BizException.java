package com.rabbit.boot.webtest.common;

/**
 * @author liuc198@chinaunicom.cn
 * @description
 * @date 2017/12/11 17:51
 */
public class BizException extends Exception {

	private static final long serialVersionUID = -4586497711041741635L;

	private static String TIP_HEAD = "业务处理出现异常";
	private String code = ReturnCodeEnum.SUCCESS.code;
	private String msg = ReturnCodeEnum.SUCCESS.msg;

	public BizException() {
		super(TIP_HEAD);
		this.code = ReturnCodeEnum.EXCEPTION.code;
		this.msg = ReturnCodeEnum.EXCEPTION.msg;
	}

	public BizException(String message ) {
		super(TIP_HEAD + " - " + message);
		this.code = ReturnCodeEnum.EXCEPTION.code;
		this.msg = ReturnCodeEnum.EXCEPTION.msg;
	}

	public BizException(String code, String msg ) {
		super(TIP_HEAD + " - " + code + ":" + msg);
		this.code = code;
		this.msg = msg;
	}

	public BizException(ReturnCodeEnum returnCodeEnum){
		this(returnCodeEnum.code, returnCodeEnum.msg);
	}

	public String getCode() {
		return this.code;
	}

	public String getMsg() {
		return this.msg;
	}

}
