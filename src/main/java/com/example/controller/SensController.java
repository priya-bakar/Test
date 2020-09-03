package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Sdata;
import com.example.service.SdataService;

@Controller
public class SensController {

	@Autowired
	SdataService theSdataService;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/getSdatas")
	public String getSdatas(ModelMap model) {

		List<Sdata> sdatas = theSdataService.getAllSdata();
		model.addAttribute("sdatas", sdatas);
		return "list-sdata";
	}

	@RequestMapping("/showsaveSdata")
	public String showsaveSdata(ModelMap model) {
		model.addAttribute("sdata", new Sdata());
		return "sdata";
	}

	@RequestMapping("/saveSdata")
	public String saveSdata(Sdata sdata) {
		theSdataService.savaSdata(sdata);
		return "redirect : /getSdatas";
	}

}
