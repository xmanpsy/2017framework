package com.hb.struts.action;

import com.hb.struts.model.SimpleDao;
import com.hb.struts.model.SimpleVo;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateTwoAction extends ActionSupport{
	private SimpleVo bean;
	
	
	
	public SimpleVo getBean() {
		return bean;
	}
	
	public void setBean(SimpleVo bean) {
		this.bean = bean;
	}
	
	//adsfasdf
	@Override
	public void validate() {
		if(bean.getSabun()==0)addFieldError("sabun", "����� �Է�");
		if("".equals(bean.getName()))addFieldError("name", "�̸��� �Է�");
		if(bean.getPay()==0)addFieldError("pay", "�ݾ��� �Է�");
	}
	
	
	
	@Override
    public String execute() throws Exception {
		int result=0;
		result=new SimpleDao().UpdateOne(bean);
		if(result>0)
			return SUCCESS;
		else
			return INPUT;
}
}