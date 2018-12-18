package com.jungjoongi.service.estimate.impl;

import java.text.DecimalFormat;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.jungjoongi.service.auth.dto.LoginInfoDto;
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
	
	@Override
	public int estimateUpdate(EstimateReqDto estimateReqDto) {
		return estimateDao.update(estimateReqDto);
	}
	
	@Override
	public int estimateInsert(EstimateReqDto estimateReqDto) {
		return estimateDao.insert(estimateReqDto);
	}
	
	@Override
	public EstimateSelectDto estimateSelectOne(EstimateReqDto estimateReqDto) {
		
		EstimateSelectDto estimate = estimateDao.selectOne(estimateReqDto);
		estimate.setDates((estimate.getDates().substring(0, 10)));
		return estimate;
	}


	@Override
	public List<EstimateDto> estimateList(LoginInfoDto info) {
		
		DecimalFormat formatter = new DecimalFormat("###,###");		
		List<EstimateDto> estimate = estimateDao.list(info);
		
		for (EstimateDto list : estimate) {
			if(!StringUtils.isEmpty(list.getBudget())) {
				list.setBudget(formatter.format(Integer.parseInt(list.getBudget())).toString());
			}
		}
		
		return estimate;
	}

	@Override
	public EstimatePayDto estimateListPay(LoginInfoDto info) {
		
		DecimalFormat formatter = new DecimalFormat("###,###");		
		EstimatePayDto payList = estimateDao.listPay(info);
		if(payList == null) {
			
			System.out.println(payList);
			EstimatePayDto emptyList = new EstimatePayDto();
			emptyList.setReTotal("0");
			emptyList.setReRequired("0");
			emptyList.setReCompleted("0");

			return emptyList;
		}
		Long total = payList.getTotal();
		Long required = payList.getRequired();
		Long completed = payList.getCompleted();
		
		payList.setReTotal((total == null) ? "0" : formatter.format(total));
		payList.setReRequired((required == null) ? "0" : formatter.format(required));
		payList.setReCompleted((completed == null) ? "0" : formatter.format(completed));
		
		return payList;
	}
	
	@Override
	public int estimateDelete(EstimateReqDto estimateReqDto) {
		return estimateDao.delete(estimateReqDto);
	}
	
}
