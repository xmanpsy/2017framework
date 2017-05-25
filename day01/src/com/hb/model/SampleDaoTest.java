package com.hb.model;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleDaoTest {
	static Logger log = Logger.getLogger(SampleDaoTest.class);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSelectAll() throws ClassNotFoundException, SQLException{
		SampleDao dao = new SampleDao();
		List<map<String, Object>> list = dao.selectAll(); 
		
	}

}
