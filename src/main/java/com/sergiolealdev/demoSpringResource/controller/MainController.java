package com.sergiolealdev.demoSpringResource.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		model.put("time", sdf.format(new Date()));
		return "index";
	}
}
