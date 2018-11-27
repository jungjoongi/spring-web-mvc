package com.jungjoongi.estimate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jungjoongi.estimate.dao.EstimateDao;
import com.jungjoongi.estimate.dto.EstimateReqDto;

@Service
public class EstimateService {

	@Autowired EstimateDao estimateDao;
	
//	EstimateService(EstimateDao estimateDao) {
//		this.estimateDao = estimateDao;
//	}
	
	
	public int EstimateInsert(EstimateReqDto estimateReqDto) {
		
		return estimateDao.insert(estimateReqDto);
	}
	
}
