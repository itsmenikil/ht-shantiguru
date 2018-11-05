package com.hawkertracker.entity;


public class UserGroup {

	private Long userGroupId;
	private String userGroupName;
	private String userPermission;
	
	public Long getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(Long userGroupId) {
		this.userGroupId = userGroupId;
	}
	public String getUserGroupName() {
		return userGroupName;
	}
	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
	}
	public String getUserPermission() {
		return userPermission;
	}
	public void setUserPermission(String userPermission) {
		this.userPermission = userPermission;
	}
	
	@Override
	public String toString() {
		return "UserGroup [userGroupId=" + userGroupId + ", userGroupName=" + userGroupName + ", userPermission="
				+ userPermission + "]";
	}	
}
