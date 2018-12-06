package com.jungjoongi.service.estimate.impl;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.jungjoongi.service.estimate.dao.EstimateDao;
import com.jungjoongi.service.estimate.dto.EstimateDto;
import com.jungjoongi.service.estimate.dto.EstimatePayDto;
import com.jungjoongi.service.estimate.dto.EstimateReqDto;
import com.jungjoongi.service.estimate.dto.EstimateSelectDto;
import com.jungjoongi.service.estimate.service.EstimateService;

@Service
public class EstimateServiceImpl implements EstimateService {

	EstimateDao estimateDao;
	
	EstimateServiceImpl(EstimateDao estimateDao) {
		this.estimateDao = estimateDao;
	}
	
	
	public int estimateInsert(EstimateReqDto estimateReqDto) {
		
		return estimateDao.insert(estimateReqDto);
	}
	
	public EstimateSelectDto estimateSelectOne(EstimateReqDto estimateReqDto) {
		
		EstimateSelectDto estimate = estimateDao.selectOne(estimateReqDto);
		estimate.setDates((estimate.getDates().substring(0, 10)));
		System.out.println(estimate.getDates());
		return estimate;
	}


	@Override
	public List<EstimateDto> estimateList() {
		
		DecimalFormat formatter = new DecimalFormat("###,###");		
		List<EstimateDto> estimate = estimateDao.list();
		
		for (EstimateDto list : estimate) {
			list.setBudget(formatter.format(Integer.parseInt(list.getBudget())).toString());
		}
		
		return estimate;
	}


	public EstimatePayDto estimateListPay() {
		
		DecimalFormat formatter = new DecimalFormat("###,###");		
		EstimatePayDto payList = estimateDao.listPay();
		
		Long total = payList.getTotal();
		Long required = payList.getRequired();
		Long completed = payList.getCompleted();
		
			payList.setReTotal(formatter.format(total));
			payList.setReRequired(formatter.format(required));
			payList.setReCompleted(formatter.format(completed));
		
		return payList;
	}
	
	
	
}
