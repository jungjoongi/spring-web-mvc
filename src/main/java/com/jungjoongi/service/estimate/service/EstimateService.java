package com.jungjoongi.service.estimate.service;

import java.util.List;

import com.jungjoongi.service.estimate.dto.EstimateDto;
import com.jungjoongi.service.estimate.dto.EstimatePayDto;
import com.jungjoongi.service.estimate.dto.EstimateReqDto;

public interface EstimateService {
	int estimateInsert(EstimateReqDto estimateReqDto);
	List<EstimateDto> estimateList();
	EstimatePayDto estimateListPay();
}
