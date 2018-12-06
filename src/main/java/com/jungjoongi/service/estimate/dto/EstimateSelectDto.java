
package com.jungjoongi.service.estimate.dto;

public class EstimateSelectDto {
	private int no;
	private String dates;
	private String list;
	private String budget;
	private String remark;
	private String isYn;
	private String types;
	private String payTypes;
	
	
	
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
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
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
