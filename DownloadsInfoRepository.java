package com.ltim.joritz.marketplace.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ltim.joritz.marketplace.model.ArtifactModel;
import com.ltim.joritz.marketplace.model.ArtifactTypeModel;
import com.ltim.joritz.marketplace.model.DownloadsInformation;

public interface DownloadsInfoRepository extends JpaRepository<DownloadsInformation, Integer>{

	
	
//	@Query("SELECT a.ArtifactType.artifactTypeName, COUNT(d.*) "
//			+ "FROM downloadsinfo d JOIN d.artifactid a "
//			+"GROUP BY a.ArtifactType.artifactTypeName")
//	List<Object[]> getDownloadsInfoGroupedByArtifactTypeName();
	
	Optional<ArtifactModel> findByDownloadedId(int id);
}

