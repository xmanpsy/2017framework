package com.hb.model;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleDaoTest {
	static Logger log = Logger.getLogger(SimpleDaoTest.class);
	static SimpleDao dao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {	
	}

	@Before
	public void setUp() throws Exception {
		dao = new SimpleDao(false);
/*		dao = new SampleDao();*/
	}

	@After
	public void tearDown() throws Exception {
		dao.back();
	}

	@Test
	public void testSampleDao() throws ClassNotFoundException, SQLException {
		Assert.assertNotNull(new SimpleDao());
	}

	@Test
	public void testSelectAll() throws SQLException, ClassNotFoundException {		
		List<Map<String,Object>> list = dao.selectAll();		
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size()>0);
		Assert.assertSame(19, list.size());
		for (Map<String, Object> map : list) {
			log.debug(map.get("sabun"));
			log.debug(map.get("name"));
		}		
	}
	@Test
	public void testSelectOne() throws Exception {
		int sabun = 1000;
		SimpleDao dao = new SimpleDao();
		Map<String,Object> map = dao.selectOne(sabun);
		Assert.assertNotNull(map);
		Assert.assertEquals(sabun, map.get("sabun"));
		Assert.assertEquals("aaaa", map.get("name"));
		Assert.assertEquals(1111, map.get("pay"));
		}
	@Test
	public void testInsertOne() throws SQLException{ 
		int sabun = 4000;
		int pay = 4444;
		String name = "Gopdan";
		int result = dao.insertOne(sabun, name, pay);
		Assert.assertSame(1, result);
	}
	
}