package com.biz.hello;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.biz.hello.config.DBConnection;
import com.biz.hello.dao.ScoreDao;
import com.biz.hello.persistence.ScoreDTO;

public class ScoreEx_01 {

	public static void main(String[] args) {

		SqlSession sqlSession = DBConnection
				.getSqlSessionFactory()
				.openSession(true);
		
		ScoreDao scoreDao = sqlSession.getMapper(ScoreDao.class);
		List<ScoreDTO> scoreList = scoreDao.selectAll();
		
		for(ScoreDTO dto : scoreList) {
			System.out.println(dto.toString());
		}
	}
}
