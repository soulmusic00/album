package com.spring.music.album.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class AlbumDto {
	
	private int albumId;
	private String albumTitle;
	private String albumSinger;
	private int albumPrice;
	private String albumLabel;
	private String albumSort;
	private Date albumReleaseDate;
	private int deliveryInfo;
	private String albumStatus;
	private String albumIntro;
	

	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	public String getAlbumSinger() {
		return albumSinger;
	}
	public void setAlbumSinger(String albumSinger) {
		this.albumSinger = albumSinger;
	}
	public int getAlbumPrice() {
		return albumPrice;
	}
	public void setAlbumPrice(int albumPrice) {
		this.albumPrice = albumPrice;
	}
	public String getAlbumLabel() {
		return albumLabel;
	}
	public void setAlbumLabel(String albumLabel) {
		this.albumLabel = albumLabel;
	}
	public String getAlbumSort() {
		return albumSort;
	}
	public void setAlbumSort(String albumSort) {
		this.albumSort = albumSort;
	}
	public Date getAlbumReleaseDate() {
		return albumReleaseDate;
	}
	public void setAlbumReleaseDate(Date albumReleaseDate) {
		this.albumReleaseDate = albumReleaseDate;
	}
	public int getDeliveryInfo() {
		return deliveryInfo;
	}
	public void setDeliveryInfo(int deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}
	public String getAlbumStatus() {
		return albumStatus;
	}
	public void setAlbumStatus(String albumStatus) {
		this.albumStatus = albumStatus;
	}
	public String getAlbumIntro() {
		return albumIntro;
	}
	public void setAlbumIntro(String albumIntro) {
		this.albumIntro = albumIntro;
	}
	
	@Override
	public String toString() {
		return "AlbumDto [albumId=" + albumId + ", albumTitle=" + albumTitle + ", albumSinger=" + albumSinger
				+ ", albumPrice=" + albumPrice + ", albumLabel=" + albumLabel + ", albumSort=" + albumSort
				+ ", albumReleaseDate=" + albumReleaseDate + ", deliveryInfo=" + deliveryInfo + ", albumStatus="
				+ albumStatus + ", albumIntro=" + albumIntro + "]";
	}
	
}
