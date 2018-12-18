
package com.jungjoongi.service.estimate.dto;

import java.sql.Date;

public class EstimateDto {
	private int no;
	private Date dates;
	private String list;
	private String budget;
	private String remark;
	private String isYn;
	private String types;
	private String payTypes;
	private String memId;
	
	
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getPayTypes() {
		return payTypes;
	}
	public void setPayTypes(String payTypes) {
		this.payTypes = payTypes;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Date getDates() {
		return dates;
	}
	public void setDates(Date dates) {
		this.dates = dates;
	}
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getIsYn() {
		return isYn;
	}
	public void setIsYn(String isYn) {
		this.isYn = isYn;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	
}
