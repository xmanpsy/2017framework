package com.hb.struts.action;

import org.apache.log4j.Logger;

import com.hb.struts.model.SimpleDao;
import com.hb.struts.model.SimpleVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class InsertThreeAction implements Action,ModelDriven,Preparable{
	private Logger log;
	private SimpleVo bean;
	
	
	//주어진 빈을 받아서
	public SimpleVo getBean() {
		return bean;
	}
	
	//전달
	public void setBean(SimpleVo bean) {
		log=Logger.getLogger(this.getClass());
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

	@Override
	public Object getModel() {
		return bean;
	}

	@Override
	public void prepare() throws Exception {
		bean=new SimpleVo();
	}

}
