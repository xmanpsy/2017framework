package com.hb.action;

import com.hb.model.SimpleDao;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteOne extends ActionSupport {
	private int sabun;
	
	
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	@Override
	public String execute() throws Exception {
		SimpleDao dao = new SimpleDao();
		int result=dao.deleteOne(sabun);
		System.out.println("¼º°ø:"+result);
		if(result>0)
			return this.SUCCESS;
		else
			return this.ERROR;
	}
}