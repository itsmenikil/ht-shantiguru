package com.hawkertracker.ui.model;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StoreVO {

	private String storeName;
	private String addressLine1;
	private String addressLine2;
	private String country;
	private String state;
	private String pincode;
	private String storeContact;
	private String username;
	private String userPassword;
	private String userEmail;
	private String userContact;
	private String userFirstName;
	private String userLastName;
	private String isActive;
	private Integer usertypeId;
	private List<Integer> userGroupIds;
	
	public String getStoreName() {
		return storeName;
	}
	public void setStorename(String storeName) {
		this.storeName = storeName;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getStoreContact() {
		return storeContact;
	}
	public void setStoreContact(String storeContact) {
		this.storeContact = storeContact;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserContact() {
		return userContact;
	}
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Integer getUsertypeId() {
		return usertypeId;
	}
	public void setUsertypeId(Integer usertypeId) {
		this.usertypeId = usertypeId;
	}
	public List<Integer> getUserGroupIds() {
		return userGroupIds;
	}
	public void setUserGroupIds(List<Integer> userGroupIds) {
		this.userGroupIds = userGroupIds;
	}
	
	@Override
	public String toString() {
		return "StoreVO [storename=" + storeName + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", country=" + country + ", state=" + state + ", pincode=" + pincode + ", storeContact="
				+ storeContact + ", username=" + username + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + ", userContact=" + userContact + ", userFirstName=" + userFirstName + ", userLastName="
				+ userLastName + ", isActive=" + isActive + ", usertypeId=" + usertypeId + ", userGroupIds="
				+ userGroupIds + "]";
	}

	
	public static StoreVO fromJson(String storeJson) throws JsonParseException, JsonMappingException, IOException {
			ObjectMapper object=new ObjectMapper();
			return object.readValue(storeJson, StoreVO.class);
	}
}
