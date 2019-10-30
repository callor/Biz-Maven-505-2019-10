package com.biz.hello;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.biz.hello.config.DBConnection;
import com.biz.hello.dao.BookDao;
import com.biz.hello.persistence.BookDTO;

public class BookEx_01 {

	public static void main(String[] args) {

		SqlSession sqlSession = DBConnection
				.getSqlSessionFactory()
				.openSession(true);
		
		BookDao bookDao = sqlSession.getMapper(BookDao.class);
		List<BookDTO> bookList = bookDao.selectAll();
		
		for(BookDTO dto : bookList) {
			System.out.println(dto.toString());
		}
	}
}
