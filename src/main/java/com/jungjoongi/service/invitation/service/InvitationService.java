package com.jungjoongi.service.invitation.service;

import java.util.List;

import com.jungjoongi.service.auth.dto.LoginInfoDto;
import com.jungjoongi.service.estimate.dto.EstimateDto;
import com.jungjoongi.service.estimate.dto.EstimatePayDto;
import com.jungjoongi.service.estimate.dto.EstimateReqDto;
import com.jungjoongi.service.estimate.dto.EstimateSelectDto;
import com.jungjoongi.service.estimate.dto.SaveMemoDto;
import com.jungjoongi.service.estimate.dto.SaveMemoReqDto;

public interface InvitationService {
	int estimateInsert(EstimateReqDto estimateReqDto);
	int estimateUpdate(EstimateReqDto estimateReqDto);
	int estimateDelete(EstimateReqDto estimateReqDto);
	int saveMemo(SaveMemoReqDto saveMemoReqDto);
	SaveMemoDto selectMemo(LoginInfoDto info);
	EstimateSelectDto estimateSelectOne(EstimateReqDto estimateReqDto);
	List<EstimateDto> estimateList(LoginInfoDto info);
	EstimatePayDto estimateListPay(LoginInfoDto info);
}
