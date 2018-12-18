
package com.jungjoongi.service.auth.dto;

public class LoginReqDto {
	private Long memId;
	private String memName;
	private String memPassword;

	public Long getMemId() {
		return memId;
	}
	public void setMemId(Long memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemPassword() {
		return memPassword;
	}
	public void setMemPassword(String memPassWord) {
		this.memPassword = memPassWord;
	}
	
}
