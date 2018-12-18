
package com.jungjoongi.service.auth.dto;

import java.io.Serializable;

public class LoginInfoDto implements Serializable {
	private Long memId;
	private String memName;
	
	private static final long serialVersionUID = -6440609028222726082L;
	
	
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
}
