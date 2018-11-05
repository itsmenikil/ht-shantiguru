package com.hawkertracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "ht.mst.privilege")
public class Privilege {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="privilege_id")
	private Long privilegeId;
	@NotEmpty
	@Column(name="privilege_title")
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
