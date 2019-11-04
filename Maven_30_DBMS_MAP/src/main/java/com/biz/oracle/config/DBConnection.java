package com.biz.oracle.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * static SqlSessionFactory 클래스를 객체로 선언하고
 * static {} 생성자에서 sqlSessionFactory 객체를 생성
 * getSelSessionFactory() 메서드에서 sqlSessionFactory를 return
 */
public class DBConnection {

	private static SqlSessionFactory sqlSessionFactory;
	
	
	static {
		
		String configFile = "com/biz/oracle/config/mybatis-config.xml";
		InputStream is = null;
		
		try {
			is = Resources.getResourceAsStream(configFile);
			
			SqlSessionFactoryBuilder sessionFactoryBuilder
			= new SqlSessionFactoryBuilder();
			
			if(sqlSessionFactory == null) {
				sqlSessionFactory = sessionFactoryBuilder.build(is);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
}
