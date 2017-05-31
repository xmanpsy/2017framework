package com.hb.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hb.engine.FrontImp;
import com.hb.model.SimpleDao;

public class DetailController implements FrontImp{

	public String execute(HttpServletRequest req) {
		try{
		SimpleDao dao = new SimpleDao();
		Map<String,Object> map=dao.selectOne(Integer.parseInt(req.getParameter("idx")));
		req.setAttribute("bean", map);
		
		dao.close();
		
		}catch (Exception e) {
		}
		return "/detail.jsp";
	}
}