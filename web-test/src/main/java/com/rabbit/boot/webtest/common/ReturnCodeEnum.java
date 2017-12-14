package com.rabbit.boot.webtest.common;

/**
 * @author wangjingyang
 * @ClassName: ExceptionCode
 * @Description: 异常枚举类
 * @date 2017年8月30日 上午11:17:46
 */
public enum ReturnCodeEnum {

	/**
	 * 成功
	 */
	SUCCESS("0000", "成功"),
	EXCEPTION("9999", "服务器代码发生异常,请联系管理员"),

	NULL_POINTER_EXCEPTION("2000", "发生空指针异常"),
	ILLEGAL_ARGUMENT_EXCEPTION("2001", "请求参数类型不匹配"),
	SQL_EXCEPTION("2002", "数据库访问异常"),

	//黑名单
	BLACK_NAME_ERROR("3000", "触发黑名单列表"),

	//业务
	PARAMNULL_EXCEPTION("4000", "参数不能为NULL");

	public final String code;
	public final String msg;

	ReturnCodeEnum(String code, String msg ) {
		this.msg = msg;
		this.code = code;
	}
}

