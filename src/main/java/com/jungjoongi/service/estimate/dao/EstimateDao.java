package com.jungjoongi.service.estimate.dao;

import java.util.List;

import com.jungjoongi.service.estimate.dto.EstimateDto;
import com.jungjoongi.service.estimate.dto.EstimatePayDto;
import com.jungjoongi.service.estimate.dto.EstimateReqDto;

public interface EstimateDao {
	public int insert(EstimateReqDto estimateReqDto);
	public List<EstimateDto> list();
	public EstimatePayDto listPay();
}
