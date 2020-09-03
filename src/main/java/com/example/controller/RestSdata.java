package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Sdata;
import com.example.service.SdataService;

@RestController
public class RestSdata {

	@Autowired
	SdataService theSdataService;
	
	@RequestMapping(value="/restSdata", method=RequestMethod.GET)
	public List<Sdata> getAllSdata(){
		
		return (List<Sdata>)theSdataService.getAllSdata();
	}
	
	@RequestMapping(value="/restSaveSdata", method=RequestMethod.PUT)
	public void restsaveSdata(@PathVariable("sdata") Sdata sdata){
		
		theSdataService.savaSdata(sdata);
	}
}