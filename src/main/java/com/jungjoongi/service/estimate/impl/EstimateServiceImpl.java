package com.jungjoongi.service.estimate.impl;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jungjoongi.service.estimate.dao.EstimateDao;
import com.jungjoongi.service.estimate.dto.EstimateDto;
import com.jungjoongi.service.estimate.dto.EstimateReqDto;
import com.jungjoongi.service.estimate.service.EstimateService;

@Service
public class EstimateServiceImpl implements EstimateService {

	EstimateDao estimateDao;
	
	EstimateServiceImpl(EstimateDao estimateDao) {
		this.estimateDao = estimateDao;
	}
	
	
	public int EstimateInsert(EstimateReqDto estimateReqDto) {
		
		return estimateDao.insert(estimateReqDto);
	}


	@Override
	public List<EstimateDto> EstimateList() {
		
		DecimalFormat formatter = new DecimalFormat("###,###");		
		List<EstimateDto> estimate = estimateDao.list();
		
		for (EstimateDto list : estimate) {
			list.setBudget(formatter.format(Integer.parseInt(list.getBudget())).toString());
		}
		
		return estimate;
	}
	
	
	
}
