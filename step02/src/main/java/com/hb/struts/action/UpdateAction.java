package com.hb.struts.action;

import org.apache.log4j.Logger;

import com.hb.struts.model.SimpleVo;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport{
	private Logger log = Logger.getLogger(this.getClass());
	private SimpleVo bean = new SimpleVo();
	
	public SimpleVo getBean() {
		return bean;
	}
	
	public void setBean(SimpleVo bean) {
		this.bean = bean;
	}

	private boolean isValidate(){
		if(bean.getSabun()==0) return false;
		if(bean.getNalja()==null||"".equals(bean.getName())) return false;
		if(bean.getPay()==0)return false;
		return true;
		
	}
	
	@Override
	public String execute() throws Exception {
		log.debug(bean);
		if(isValidate())
			return SUCCESS;
		else
			return INPUT;
	}
	
}
