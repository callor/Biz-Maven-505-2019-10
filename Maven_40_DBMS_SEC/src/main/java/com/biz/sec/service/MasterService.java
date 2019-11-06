package com.biz.sec.service;

import java.util.List;

import com.biz.sec.config.DBConnectionSEC;
import com.biz.sec.mapper.MDDao;
import com.biz.sec.persistence.MasterDetailVO;

public class MasterService {

	protected MDDao mdDao;
	
	{
		
		mdDao = DBConnectionSEC
				.getInstance()
				.openSession(true)
				.getMapper(MDDao.class);
	}
	
	public void masterAndDetail() {
		List<MasterDetailVO> mdList = mdDao.selectAll();
	}
	
}
