
package com.jungjoongi.service.estimate.dto;

public class EstimatePayDto {
	private Long total;
	private Long required;
	private Long completed;
	private String reTotal;
	private String reRequired;
	private String reCompleted;
	
	
	public String getReTotal() {
		return reTotal;
	}
	public void setReTotal(String reTotal) {
		this.reTotal = reTotal;
	}
	public String getReRequired() {
		return reRequired;
	}
	public void setReRequired(String reRequired) {
		this.reRequired = reRequired;
	}
	public String getReCompleted() {
		return reCompleted;
	}
	public void setReCompleted(String reCompleted) {
		this.reCompleted = reCompleted;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getRequired() {
		return required;
	}
	public void setRequired(Long required) {
		this.required = required;
	}
	public Long getCompleted() {
		return completed;
	}
	public void setCompleted(Long completed) {
		this.completed = completed;
	}
	
}
