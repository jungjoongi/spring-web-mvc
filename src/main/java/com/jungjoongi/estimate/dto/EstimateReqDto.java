
package com.jungjoongi.estimate.dto;

import java.sql.Date;

public class EstimateReqDto {
	int no;
	Date date;
	String list;
	String budget;
	String remark;
	String isYn;
	String type;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
