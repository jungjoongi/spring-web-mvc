package com.jungjoongi.service.estimate.service;

import java.util.List;

import com.jungjoongi.service.auth.dto.LoginInfoDto;
import com.jungjoongi.service.estimate.dto.EstimateDto;
import com.jungjoongi.service.estimate.dto.EstimatePayDto;
import com.jungjoongi.service.estimate.dto.EstimateReqDto;
import com.jungjoongi.service.estimate.dto.EstimateSelectDto;

public interface EstimateService {
	int estimateInsert(EstimateReqDto estimateReqDto);
	int estimateUpdate(EstimateReqDto estimateReqDto);
	int estimateDelete(EstimateReqDto estimateReqDto);
	EstimateSelectDto estimateSelectOne(EstimateReqDto estimateReqDto);
	List<EstimateDto> estimateList(LoginInfoDto info);
	EstimatePayDto estimateListPay(LoginInfoDto info);
}
