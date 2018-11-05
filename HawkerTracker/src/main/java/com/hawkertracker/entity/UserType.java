package com.hawkertracker.entity;

public class UserType {

	private Long userTypeId;
	private String userTypeName;
	
	public Long getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(Long userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getUserTypeName() {
		return userTypeName;
	}
	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}
	@Override
	public String toString() {
		return "UserType [userTypeId=" + userTypeId + ", userTypeName=" + userTypeName + "]";
	}
	
	
}
