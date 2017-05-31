package com.hb.day02me.support;

import java.util.HashMap;
import java.util.Map;

import com.hb.day02me.controller.AddController;
import com.hb.day02me.controller.InsertController;
import com.hb.day02me.controller.ListController;
import com.hb.day02me.controller.MyController;

public class HandlerMapping {
	private static Map<String,String> map = new HashMap<String,String>();
	
	public static void setMap(String param1,String param2){
		HandlerMapping.map.put(param1,param2);
	}
	
	static public MyController mapping(String uri) {
		MyController controller=null;
		
			try {
				Class clazz = Class.forName(map.get(uri));
				controller = (MyController) clazz.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

		
		return controller;
		
	}
}
