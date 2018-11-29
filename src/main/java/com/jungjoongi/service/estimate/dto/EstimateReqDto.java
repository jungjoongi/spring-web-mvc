
package com.jungjoongi.service.estimate.dto;

import java.sql.Date;

public class EstimateReqDto {
	private int no;
	private Date dates;
	private String list;
	private String budget;
	private String remark;
	private String isYn;
	private String types;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Date getDate() {
		return dates;
	}
	public void setDate(Date dates) {
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
	public String getType() {
		return types;
	}
	public void setType(String types) {
		this.types = types;
	}
	
}
