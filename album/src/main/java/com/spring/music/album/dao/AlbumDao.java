package com.spring.music.album.dao;

import com.spring.music.album.dto.AlbumDto;

public interface AlbumDao {
	
	public AlbumDto selectAlbumDetail(int albumId) throws Exception;
	

}
