package com.hawkertracker.entity;

public class Privilege {

	private Long privilegeId;
	private String privilegeTitle;
	
	
	public Long getPrivilegeId() {
		return privilegeId;
	}
	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}
	
	public String getPrivilegeTitle() {
		return privilegeTitle;
	}
	public void setPrivilegeTitle(String privilegeTitle) {
		this.privilegeTitle = privilegeTitle;
	}
	
	@Override
	public String toString() {
		return "Privilege [privilegeId=" + privilegeId + ", privilegeTitle=" + privilegeTitle + "]";
	}
	
	
}
