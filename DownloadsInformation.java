package com.ltim.joritz.marketplace.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="DownloadsInfo")
public class DownloadsInformation {

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="downloadedId")
	private int downloadedId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="artifactId")
	private ArtifactModel artifactModel;
	
	@Column (name="isUserPublic")
	private boolean isUserPublic;
	
	@Column (name="userId")
	private int userId;
	
	@Column (name="userMail")
	private String userMail;
	
	
	public DownloadsInformation()
	{
		super();
	}
	
	public DownloadsInformation(int downloadedId, ArtifactModel artifactModel, boolean isUserPublic, int userId,
			String userMail) {
		super();
		this.downloadedId = downloadedId;
		this.artifactModel = artifactModel;
		this.isUserPublic = isUserPublic;
		this.userId = userId;
		this.userMail = userMail;
	}

	public int getDownloadedId() {
		return downloadedId;
	}

	public void setDownloadedId(int downloadedId) {
		this.downloadedId = downloadedId;
	}

	public ArtifactModel getArtifactModel() {
		return artifactModel;
	}

	public void setArtifactModel(ArtifactModel artifactModel) {
		this.artifactModel = artifactModel;
	}

	public boolean isUserPublic() {
		return isUserPublic;
	}

	public void setUserPublic(boolean isUserPublic) {
		this.isUserPublic = isUserPublic;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	
	
	
	
	
	
	
}
