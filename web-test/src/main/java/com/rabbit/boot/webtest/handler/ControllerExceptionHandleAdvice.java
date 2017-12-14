package com.rabbit.boot.webtest.handler;

import com.rabbit.boot.webtest.common.BizException;
import com.rabbit.boot.webtest.common.ResultEntity;
import com.rabbit.boot.webtest.common.ReturnCodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

/**
 * @Author: guoyankui
 * @DATE: 13/12/2017 10:47 AM
 */
@RestControllerAdvice
public class ControllerExceptionHandleAdvice {
	private final static Logger logger = LoggerFactory.getLogger(ControllerExceptionHandleAdvice.class);

	@ExceptionHandler
	public ResultEntity<?> handler(HttpServletRequest req, HttpServletResponse res, Exception e ) {
		logger.info("统一异常处理，Restful Http请求发生异常...");

		if (res.getStatus() == HttpStatus.BAD_REQUEST.value()) {
			logger.info("统一异常处理，修改返回状态值为200");
			res.setStatus(HttpStatus.OK.value());
		}

		ResultEntity<?> resultEntity = new ResultEntity<>();

		if (e instanceof BizException) {
			logger.error("统一异常处理，异常代码00：" + e.getMessage(), e);
			resultEntity.setCode(((BizException) e).getCode());
			resultEntity.setMsg(((BizException) e).getMsg());
			return resultEntity;
		} else if (e instanceof NullPointerException) {
			logger.error("统一异常处理，异常代码01：" + e.getMessage(), e);
			resultEntity.setCode(ReturnCodeEnum.NULL_POINTER_EXCEPTION.code);
			resultEntity.setMsg(ReturnCodeEnum.NULL_POINTER_EXCEPTION.msg);
			return resultEntity;
		} else if (e instanceof IllegalArgumentException) {
			logger.error("统一异常处理，异常代码02：" + e.getMessage(), e);
			resultEntity.setCode(ReturnCodeEnum.ILLEGAL_ARGUMENT_EXCEPTION.code);
			resultEntity.setMsg(ReturnCodeEnum.ILLEGAL_ARGUMENT_EXCEPTION.msg);
			return resultEntity;
		} else if (e instanceof SQLException) {
			logger.error("统一异常处理，异常代码03：" + e.getMessage(), e);
			resultEntity.setCode(ReturnCodeEnum.SQL_EXCEPTION.code);
			resultEntity.setMsg(ReturnCodeEnum.SQL_EXCEPTION.msg);
			return resultEntity;
		} else {
			logger.error("统一异常处理，异常代码99：" + e.getMessage(), e);
			resultEntity.setCode(ReturnCodeEnum.EXCEPTION.code);
			resultEntity.setMsg(ReturnCodeEnum.EXCEPTION.msg);
			return resultEntity;
		}
	}
}
