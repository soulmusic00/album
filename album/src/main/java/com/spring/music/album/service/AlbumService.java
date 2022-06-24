package com.spring.music.album.service;

import java.util.List;

import com.spring.music.album.dto.AlbumDto;

public interface AlbumService {

	public AlbumDto albumDetail(int albumId) throws Exception;
	public List<AlbumDto> listAlbum() throws Exception;
	
	
	
}
