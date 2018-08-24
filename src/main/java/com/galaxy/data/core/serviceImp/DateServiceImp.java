package com.galaxy.data.core.serviceImp;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.gaiaxy.data.core.dto.DateFormatDto;
import com.galaxy.data.core.service.DateService;
import com.galaxy.data.core.util.DateUtil;

@Service
public class DateServiceImp implements DateService {

	public String getYear(DateFormatDto dto) {
		// DateUtil.DateFrom(dto.getPattern(), new Date());
		return DateUtil.DateFrom(dto.getPattern(), new Date());
	}

	public String getYm(DateFormatDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
