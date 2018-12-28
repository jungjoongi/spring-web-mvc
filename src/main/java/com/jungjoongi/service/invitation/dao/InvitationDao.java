package com.jungjoongi.service.invitation.dao;

import java.util.List;

import com.jungjoongi.service.auth.dto.LoginInfoDto;
import com.jungjoongi.service.estimate.dto.EstimateDto;
import com.jungjoongi.service.estimate.dto.EstimatePayDto;
import com.jungjoongi.service.estimate.dto.EstimateReqDto;
import com.jungjoongi.service.estimate.dto.EstimateSelectDto;
import com.jungjoongi.service.estimate.dto.SaveMemoDto;
import com.jungjoongi.service.estimate.dto.SaveMemoReqDto;

public interface InvitationDao {
	public int insert(EstimateReqDto estimateReqDto);
	public int update(EstimateReqDto estimateReqDto);
	public int delete(EstimateReqDto estimateReqDto);
	public int saveMemo(SaveMemoReqDto saveMemoReqDto);
	public SaveMemoDto selectMemo(LoginInfoDto info);
	public EstimateSelectDto selectOne(EstimateReqDto estimateReqDto);
	public List<EstimateDto> list(LoginInfoDto info);
	public EstimatePayDto listPay(LoginInfoDto info);
}
