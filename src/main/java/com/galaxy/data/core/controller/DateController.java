package com.galaxy.data.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;
import com.gaiaxy.data.core.dto.DateFormatDto;
import com.galaxy.data.core.service.DateService;

@RestController
public class DateController {
	@Autowired
	private DateService dateservice;
	private static Logger log = LoggerFactory.getLogger(DateController.class);

	@RequestMapping(value = "/getDate", method = { RequestMethod.POST }, produces = { "application/json" }, consumes = {
			"application/json" })
	public Object getDate(@RequestParam(name = "code") String code, @RequestParam(name = "desc") String desc) {
		log.debug("code:{},desc:{}", code, desc);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", code);
		jsonObject.put("desc", desc);
		return jsonObject;
	}

	@RequestMapping(value = "/getYDate", method = { RequestMethod.POST }, produces = {
			"application/json" }, consumes = { "application/json" })
	public Object getYDate(@RequestBody DateFormatDto dto) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("formatedate", dateservice.getYear(dto));
		return jsonObject;
	}

}
