package com.spring.music.album.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.music.album.service.AlbumService;

@Controller
@RequestMapping("/album")
public class AlbumController {

	@Autowired
	private AlbumService albumService;
	
//	@RequestMapping(value="/albumDetail", method=RequestMethod.GET) 
//	public String albumDetail(@RequestParam("albumId") int albumId, Model model) throws Exception {
//		
//		model.addAttribute("album", albumService.albumDetail(albumId));
//		
//		return "album/albumDetail";
//	}
//	
	
	@RequestMapping(value="/detail", method = RequestMethod.GET) 
	public ModelAndView detail(@RequestParam("albumId")int albumId) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/album/albumDetail");
		mv.addObject("album", albumService.albumDetail(albumId));
		
		return mv;
		
	}
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public ModelAndView shop() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/album/albumList");
		mv.addObject("albums", albumService.listAlbum());
		
		return mv;
		
		
	}
	
	
	
	
	
}




