package com.ltim.joritz.marketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.joritz.marketplace.service.DownloadInfoService;

@RestController
@RequestMapping("/marketplace")

public class DownloadController {

	@Autowired
	private DownloadInfoService downloadInfoService;
	
//	@GetMapping("/downloads/groupedByType")
//	public ResponseEntity<List<Object[]>> getDownloadsGroupByArtifactTypeName(){
//	
//	  List<Object[]> result = downloadInfoService.getDownloadsGroupedByArtifactTypeName();
//	  return new ResponseEntity<>(result, HttpStatus.OK);
//	}
	
	}
	

