package com.hawkertracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "ht.mst.store")
public class Store {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long storeId;
	
	@NotEmpty
	@Column(name="store_name")
	private String storeName;
	@NotEmpty
	@Column(name="store_logo_path")
	private String storeLogoPath;
	@NotEmpty
	@Column(name="store_address_line1")
	private String storeAddressLine1;
	@NotEmpty
	@Column(name="store_address_line2")
	private String storeAddressLine2;
	@NotEmpty
	@Column(name="store_country")
	private String storeCountry;
	@NotEmpty
	@Column(name="store_state")
	private String storeState;
	@NotEmpty
	@Column(name="store_pincode")
	private String storePincode;
	
	
	
	public Store(Long storeId, String storeName, String storeLogoPath, String storeAddressLine1,
			String storeAddressLine2, String storeCountry, String storeState, String storePincode) {
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeLogoPath = storeLogoPath;
		this.storeAddressLine1 = storeAddressLine1;
		this.storeAddressLine2 = storeAddressLine2;
		this.storeCountry = storeCountry;
		this.storeState = storeState;
		this.storePincode = storePincode;
	}
	
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreLogoPath() {
		return storeLogoPath;
	}
	public void setStoreLogoPath(String storeLogoPath) {
		this.storeLogoPath = storeLogoPath;
	}
	public String getStoreAddressLine1() {
		return storeAddressLine1;
	}
	public void setStoreAddressLine1(String storeAddressLine1) {
		this.storeAddressLine1 = storeAddressLine1;
	}
	public String getStoreAddressLine2() {
		return storeAddressLine2;
	}
	public void setStoreAddressLine2(String storeAddressLine2) {
		this.storeAddressLine2 = storeAddressLine2;
	}
	public String getStoreCountry() {
		return storeCountry;
	}
	public void setStoreCountry(String storeCountry) {
		this.storeCountry = storeCountry;
	}
	public String getStoreState() {
		return storeState;
	}
	public void setStoreState(String storeState) {
		this.storeState = storeState;
	}
	public String getStorePincode() {
		return storePincode;
	}
	public void setStorePincode(String storePincode) {
		this.storePincode = storePincode;
	}
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", storeLogoPath=" + storeLogoPath
				+ ", storeAddressLine1=" + storeAddressLine1 + ", storeAddressLine2=" + storeAddressLine2
				+ ", storeCountry=" + storeCountry + ", storeState=" + storeState + ", storePincode=" + storePincode
				+ "]";
	}
	
}
