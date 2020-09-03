package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Sdata;
import com.example.repository.SdataRepository;

@Service
public class SdataService {

	@Autowired
	SdataRepository theSdataRepository;

	public List<Sdata> getAllSdata() {

		return (List<Sdata>) theSdataRepository.findAll();
	}

	public void savaSdata(Sdata sdata) {
		theSdataRepository.save(sdata);
	}
	
	public void update(Long id ){
		
	}

}
