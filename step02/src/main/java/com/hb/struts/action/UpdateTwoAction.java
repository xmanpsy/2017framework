package com.hb.struts.action;

import com.hb.struts.model.SimpleVo;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateTwoAction extends ActionSupport{
	private SimpleVo bean = new SimpleVo();
	
	public SimpleVo getBean() {
		return bean;
	}
	
	public void setBean(SimpleVo bean) {
		this.bean = bean;
	}
	
	
	@Override
	public void validate() {
		if(bean.getSabun()==0)addFieldError("sabun", "����� �Է�");
		if("".equals(bean.getName()))addFieldError("name", "�̸��� �Է�");
		if(bean.getPay()==0)addFieldError("pay", "�ݾ��� �Է�");
	}
	
	
	
	
	@Override
public String execute() throws Exception {
	return super.execute();
}
}
