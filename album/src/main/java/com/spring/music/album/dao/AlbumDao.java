package com.spring.music.album.dao;

import java.util.List;



import com.spring.music.album.dto.AlbumDto;

public interface AlbumDao {
	
	public AlbumDto selectAlbumDetail(int albumId) throws Exception;
	public List<AlbumDto> selectAlbumList() throws Exception;
	

}
