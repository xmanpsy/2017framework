package com.hb.struts.action;

import org.apache.log4j.Logger;

import com.hb.struts.model.SimpleDao;
import com.hb.struts.model.SimpleVo;
import com.opensymphony.xwork2.Action;

public class InsertTwoAction implements Action {
	Logger log=Logger.getLogger(this.getClass());
	SimpleVo bean = new SimpleVo();
	
	
	//주어진 빈을 받아서
	public SimpleVo getBean() {
		return bean;
	}
	
	//전달
	public void setBean(SimpleVo bean) {
		this.bean = bean;
	}
	
	
	@Override
	public String execute() throws Exception {
		log.debug(bean);
		SimpleDao dao = new SimpleDao();
//		int result=dao.insertOne(sabun,name,pay);
		int result=dao.insertOne(bean);
		if(result>0)
			return SUCCESS;
		else
			return INPUT;
	}

}
