package com.gaiaxy.data.core.dto;

import java.io.Serializable;

public class DateFormatDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6293993929427595127L;

	private String datetime;
	private String pattern;

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
}
