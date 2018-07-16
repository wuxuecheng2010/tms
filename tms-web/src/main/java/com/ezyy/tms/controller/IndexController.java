package com.ezyy.tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ezyy.tms.service.IndexService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

	@Autowired
	IndexService indexService;

	@ResponseBody
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index() {

		log.info("Hello Index");
		return indexService.getIndexPage();

	}

}
