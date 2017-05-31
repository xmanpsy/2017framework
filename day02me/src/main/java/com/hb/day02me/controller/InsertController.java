package com.hb.day02me.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.day02me.model.SimpleDao;
import com.hb.day02me.model.SimpleVo;

public class InsertController implements MyController{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String param1=request.getParameter("name");
		String param2=request.getParameter("nalja");
		String param3=request.getParameter("pay");
		SimpleVo vo = new SimpleVo();
		vo.setName(param1);
		vo.setNalja(param2);
		vo.setPay(Integer.parseInt(param3));
		SimpleDao dao = new SimpleDao();
		int result=0;
		
		dao.insertOne(vo);
		
		if(result>0)
		return "redirect:list.do";
		else
			return "add";
		
	}

}
