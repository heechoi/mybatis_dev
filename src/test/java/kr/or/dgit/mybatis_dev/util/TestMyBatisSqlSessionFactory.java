package kr.or.dgit.mybatis_dev.util;

import java.sql.Connection;

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
		factory = MyBatisSqlSessionFactory.getSqlSessionFactory();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		factory= null;
	}
	@Test
	public void testASqlSessionFactory() {
		factory = MyBatisSqlSessionFactory.getSqlSessionFactory();  //파일을 제대로 찾으면 null이 아니여야한다.
		Assert.assertNotNull(factory);
	}
	
	@Test
	public void testBOpenSession() {  //계정 비밀번호가 틀렸거나, 잘못됐을때  알 수 있다.
		Connection con = factory.openSession().getConnection();
		Assert.assertNotNull(con);
		
	}

}
