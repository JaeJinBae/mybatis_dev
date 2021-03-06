package kr.or.dgit.mybatis_dev.util;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMyBatisSqlSessionFactory {
	private static SqlSessionFactory factory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		factory=MyBatisSqlSessionFactory.getSqlSessionFactory();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		factory=null;
	}
	
	
	
	@Test
	public void testASqlSessionFactory() {
		SqlSessionFactory factory=MyBatisSqlSessionFactory.getSqlSessionFactory();
		Assert.assertNotNull(factory);
		
	}
	
	@Test
	public void testBopenSession() {
		SqlSession sqlSession=factory.openSession();
		Assert.assertNotNull(sqlSession);
		
		Connection con=sqlSession.getConnection();
		Assert.assertNotNull(con);
	}
	

}
