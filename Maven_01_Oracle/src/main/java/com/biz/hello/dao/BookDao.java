package com.biz.hello.dao;

import java.util.List;

import com.biz.hello.persistence.BookDTO;

public interface BookDao {

	public List<BookDTO> selectAll();

}
