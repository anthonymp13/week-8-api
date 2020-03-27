package com.yelpapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostalCodesItem{
	private String adminCode2;
	private String adminCode1;
	private String adminName2;
	private double lng;
	private String countryCode;
	private String postalCode;
	private String adminName1;
	private String iSO31662;
	private String placeName;
	private double lat;
	private String adminCode3;
	private String adminName3;

	public void setAdminCode2(String adminCode2){
		this.adminCode2 = adminCode2;
	}

	public String getAdminCode2(){
		return adminCode2;
	}

	public void setAdminCode1(String adminCode1){
		this.adminCode1 = adminCode1;
	}

	public String getAdminCode1(){
		return adminCode1;
	}

	public void setAdminName2(String adminName2){
		this.adminName2 = adminName2;
	}

	public String getAdminName2(){
		return adminName2;
	}

	public void setLng(double lng){
		this.lng = lng;
	}

	public double getLng(){
		return lng;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setAdminName1(String adminName1){
		this.adminName1 = adminName1;
	}

	public String getAdminName1(){
		return adminName1;
	}

	public void setISO31662(String iSO31662){
		this.iSO31662 = iSO31662;
	}

	public String getISO31662(){
		return iSO31662;
	}

	public void setPlaceName(String placeName){
		this.placeName = placeName;
	}

	public String getPlaceName(){
		return placeName;
	}

	public void setLat(double lat){
		this.lat = lat;
	}

	public double getLat(){
		return lat;
	}

	public void setAdminCode3(String adminCode3){
		this.adminCode3 = adminCode3;
	}

	public String getAdminCode3(){
		return adminCode3;
	}

	public void setAdminName3(String adminName3){
		this.adminName3 = adminName3;
	}

	public String getAdminName3(){
		return adminName3;
	}

	@Override
 	public String toString(){
		return 
			"PostalCodesItem{" + 
			"adminCode2 = '" + adminCode2 + '\'' + 
			",adminCode1 = '" + adminCode1 + '\'' + 
			",adminName2 = '" + adminName2 + '\'' + 
			",lng = '" + lng + '\'' + 
			",countryCode = '" + countryCode + '\'' + 
			",postalCode = '" + postalCode + '\'' + 
			",adminName1 = '" + adminName1 + '\'' + 
			",iSO3166-2 = '" + iSO31662 + '\'' + 
			",placeName = '" + placeName + '\'' + 
			",lat = '" + lat + '\'' + 
			",adminCode3 = '" + adminCode3 + '\'' + 
			",adminName3 = '" + adminName3 + '\'' + 
			"}";
		}
}
