package com.galaxy.data.core.service;

import com.gaiaxy.data.core.dto.DateFormatDto;

public interface DateService {
	
	public String getYear(DateFormatDto dto);

	public String getYm(DateFormatDto dto);
}
