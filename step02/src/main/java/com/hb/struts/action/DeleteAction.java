package com.hb.struts.action;

import com.hb.struts.model.SimpleDao;
import com.hb.struts.model.SimpleVo;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{
	private int sabun;
	
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	///asdasdaasdasd
	@Override
	public String execute() throws Exception {
		int result=0;
		
		result=new SimpleDao().deleteOne(sabun); 
		
		
		if(result>0){
			System.out.println("��������");
		return SUCCESS;
		}
		else{
			System.out.println("��������");
		return ERROR;	
		}			
		
	}
}
