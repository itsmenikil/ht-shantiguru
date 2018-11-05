package com.hawkertracker.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.hawkertracker.utility.entityauditor.Auditable;

@Entity
@Table(name = "ht.cnfg.user")
public class User extends Auditable<String> {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long userId;
	@NotEmpty
	@Column(name="user_name")
	private String username;
	@NotEmpty
	@Column(name="user_email")
	private String userEmail;
	@NotEmpty
	@Column(name="user_contact_number")
	private String userContactNumber;
	@NotEmpty
	@Column(name="user_password")
	private String password;
	@NotEmpty
	@Column(name="user_first_name")
	private String firstName;
	@NotEmpty
	@Column(name="user_last_name")
	private String lastName;
	@NotEmpty
	@Column(name="user_isactive")
	private boolean isActive;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="usertype_id")
	private UserType userType;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="usergroup_id")
	private Set<UserGroup> userGroups;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserContactNumber() {
		return userContactNumber;
	}
	public void setUserContactNumber(String userContactNumber) {
		this.userContactNumber = userContactNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public Set<UserGroup> getUserGroups() {
		return userGroups;
	}
	public void setUserGroups(Set<UserGroup> userGroups) {
		this.userGroups = userGroups;
	}
	
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
}
