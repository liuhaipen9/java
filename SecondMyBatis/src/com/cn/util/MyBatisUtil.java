package com.cn.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory sqlSessionFactory=null;
	
	static{
		try {
			InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private MyBatisUtil(){}
	public static SqlSession getSqlSession(){
		return sqlSessionFactory.openSession();
	}
}
