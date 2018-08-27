package com.gaiaxy.data.core.dto;

import java.io.Serializable;

public class OrderNoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8302032520667512407L;

	private String refixion;
	private String length;
	private String type;

	public String getRefixion() {
		return refixion;
	}

	public void setRefixion(String refixion) {
		this.refixion = refixion;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
