package com.jungjoongi.service.estimate.dao;

import java.util.List;

import com.jungjoongi.service.auth.dto.LoginInfoDto;
import com.jungjoongi.service.estimate.dto.EstimateDto;
import com.jungjoongi.service.estimate.dto.EstimatePayDto;
import com.jungjoongi.service.estimate.dto.EstimateReqDto;
import com.jungjoongi.service.estimate.dto.EstimateSelectDto;

public interface EstimateDao {
	public int insert(EstimateReqDto estimateReqDto);
	public int update(EstimateReqDto estimateReqDto);
	public int delete(EstimateReqDto estimateReqDto);
	public EstimateSelectDto selectOne(EstimateReqDto estimateReqDto);
	public List<EstimateDto> list(LoginInfoDto info);
	public EstimatePayDto listPay(LoginInfoDto info);
}
