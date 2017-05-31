package com.hb.action;

import com.hb.model.SimpleDao;
import com.opensymphony.xwork2.ActionSupport;

public class AddForm extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("진입성공");
		return this.SUCCESS;
	}
}