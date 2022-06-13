package com.spring.music.album.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.music.album.dao.AlbumDao;
import com.spring.music.album.dto.AlbumDto;

@Service
public class AlbumServiceImpl implements AlbumService{

	@Autowired
	private AlbumDao albumDao;
	
	public AlbumDto albumDetail(int albumId) throws Exception {
		return albumDao.selectAlbumDetail(albumId);
		
	}
	
	
	
}
