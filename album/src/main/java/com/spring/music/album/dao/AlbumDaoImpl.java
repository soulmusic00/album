package com.spring.music.album.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.music.album.dto.AlbumDto;

@Repository
public class AlbumDaoImpl implements AlbumDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public AlbumDto selectAlbumDetail(int albumId) throws Exception {
		return sqlSession.selectOne("mapper.album.selectAlbumDetail", albumId);
	}
	
	@Override
	public List<AlbumDto> selectAlbumList() throws Exception {
		return sqlSession.selectList("mapper.album.selectAlbumList");
	}
	
	
}
