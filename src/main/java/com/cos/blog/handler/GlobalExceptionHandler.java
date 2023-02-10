package com.cos.blog.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice //모든 에러가 발생시 현재 페이지로 와서 처리를 하게해줌
@RestController
public class GlobalExceptionHandler {
		
	// value 에 해당하는 에러에 대해서만 해당방식으로 처리 
	// ( 최상위 Exception으로 적용하면 모든 에러가 해당방식으로 처리됨)
	@ExceptionHandler(value=IllegalArgumentException.class) 
	public String handleArgumentException(IllegalArgumentException e) {
		return "<h1>" +e.getMessage()+"</h1>";
	}

}
