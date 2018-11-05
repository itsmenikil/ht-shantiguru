package com.hawkertracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "ht.cnfg.usergroup")
public class UserGroup {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usergroup_id")
	private Long userGroupId;
	@NotEmpty
	@Column(name="usergroup_name")
	private String userGroupName;
	@Column(name="usergroup_permission")
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
