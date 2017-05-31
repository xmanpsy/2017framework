package com.hb.action;

import com.hb.model.SimpleDao;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateOne extends ActionSupport {

	private int sabun, pay;
	private String name, nalja;

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNalja(String nalja) {
		this.nalja = nalja;
	}

	@Override
	public String execute() throws Exception {
		SimpleDao dao = new SimpleDao();
		int result=dao.UpdateOne(sabun,name,nalja,pay);
		System.out.println("1이면 성공:" + result);
		if(result>0){
		return this.SUCCESS;
		}else{
		return this.ERROR;
		}
	}
}