package com.cn.firstMybatis2;

import org.apache.ibatis.session.SqlSession;

import com.cn.dto.RocUser;
import com.cn.firstMybatis.RocUserMapper;
import com.cn.util.MyBatisUtil;

public class RocUserMapperTest2 {
	
	public static void main(String[] args) {
		SqlSession session=MyBatisUtil.getSqlSession();
		RocUserMapper rocUserMapper=session.getMapper(RocUserMapper.class);
		RocUser rocUser=rocUserMapper.selectRocUserById(1);
		session.close();
		System.out.println(rocUser.toString());
	}
}
