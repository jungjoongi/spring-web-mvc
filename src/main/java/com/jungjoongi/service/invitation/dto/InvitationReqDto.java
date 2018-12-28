
package com.jungjoongi.service.invitation.dto;

public class InvitationReqDto {
	private Long ivtSeq;
	private String ivtName;
	private String ivtgiveYn;
	private String ivtRemark;

	public Long getIvtSeq() {
		return ivtSeq;
	}
	public void setIvtSeq(Long ivtSeq) {
		this.ivtSeq = ivtSeq;
	}
	public String getIvtName() {
		return ivtName;
	}
	public void setIvtName(String ivtName) {
		this.ivtName = ivtName;
	}
	public String getIvtgiveYn() {
		return ivtgiveYn;
	}
	public void setIvtgiveYn(String ivtgiveYn) {
		this.ivtgiveYn = ivtgiveYn;
	}
	public String getIvtRemark() {
		return ivtRemark;
	}
	public void setIvtRemark(String ivtRemark) {
		this.ivtRemark = ivtRemark;
	}
}
