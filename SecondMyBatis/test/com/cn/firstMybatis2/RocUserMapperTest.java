package com.cn.firstMybatis2;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.cn.dto.RocUser;
import com.cn.firstMybatis.RocUserMapper;
import com.cn.util.MyBatisUtil;

import sun.applet.Main;

public class RocUserMapperTest {
	
	@Test
	public void testRocUser(){
		System.out.println("sdfsd");
//		SqlSession session=MyBatisUtil.getSqlSession();
//		RocUserMapper rocUserMapper=session.getMapper(RocUserMapper.class);
//		RocUser rocUser=rocUserMapper.selectRocUserById(1);
//		session.close();
//		System.out.println(rocUser.toString());
	}
	public static void main(String[] args) {
		SqlSession session=MyBatisUtil.getSqlSession();
		RocUserMapper rocUserMapper=session.getMapper(RocUserMapper.class);
		RocUser rocUser=rocUserMapper.selectRocUserById(1);
		session.commit();
		session.close();
		
		SqlSession session2=MyBatisUtil.getSqlSession();
		RocUserMapper rocUserMapper2=session2.getMapper(RocUserMapper.class);
		RocUser rocUser2=rocUserMapper2.selectRocUserById(1);
		session2.commit();
		session2.close();
		
		
		System.out.println(rocUser.getAge());
	}
}
