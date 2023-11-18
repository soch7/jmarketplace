package com.ltim.joritz.marketplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.joritz.marketplace.repository.DownloadsInfoRepository;

@Service
public class DownloadInfoService {
	
    @Autowired
	private DownloadsInfoRepository downloadsInfoRepository;
	
    //public List<Object[]> getDownloadsGroupedByArtifactTypeName(){
    //	return downloadsInfoRepository.getDownloadsInfoGroupedByArtifactTypeName();
    	
    //}

}
