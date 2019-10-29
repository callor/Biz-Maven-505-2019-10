package com.biz.hello.dao;

import java.util.List;

import com.biz.hello.persistence.ScoreDTO;

public interface ScoreDao {
	
	public List<ScoreDTO> selectAll();
	

}
