package com.yelpapi.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("com.robohorse.robopojogenerator")
public class Response{

	@JsonProperty("postalcodes")
	private List<PostalCodesItem> postalcodes;

	public void setPostalcodes(List<PostalCodesItem> postalcodes){
		this.postalcodes = postalcodes;
	}

	public List<PostalCodesItem> getPostalcodes(){
		return postalcodes;
	}

	@Override
 	public String toString(){
		return 
			"Response{" +
			"postalcodes = '" + postalcodes + '\'' +
			"}";
		}
}