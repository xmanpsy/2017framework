package com.hb.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hb.engine.FrontImp;
import com.hb.model.SimpleDao;

public class UpdateController implements FrontImp{

	@Override
	public String execute(HttpServletRequest req) {
		return "update.jsp";
	}
}

