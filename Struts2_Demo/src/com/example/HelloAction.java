package com.example;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {

	@Override
	public String execute() throws Exception {
		
		return "success";
	}

}
