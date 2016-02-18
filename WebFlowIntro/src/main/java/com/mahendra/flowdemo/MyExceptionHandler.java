package com.mahendra.flowdemo;

import org.springframework.webflow.engine.support.TransitionExecutingFlowExecutionExceptionHandler;

public class MyExceptionHandler extends
		TransitionExecutingFlowExecutionExceptionHandler {

	public MyExceptionHandler() {
		super();
		add(java.lang.NullPointerException.class,"Null Reference");
	}

}
