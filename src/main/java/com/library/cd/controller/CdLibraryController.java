package com.library.cd.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.cd.service.CdLibraryManager;

@Controller
@RequestMapping("/")
public class CdLibraryController {
	
	private static final Logger logger = LoggerFactory.getLogger(CdLibraryController.class);
	
	@Autowired
	CdLibraryManager cdLibraryManager;
	
	@RequestMapping(value = "/cdLibrary/allCds", method = RequestMethod.GET)
	public String getAllCds(Model model) {
		logger.debug("Inside CdLibraryController getAllCds");
		
		model.addAttribute("cdList", cdLibraryManager.getAllCds());
		return "CdListDisplay";
	}
	
	@RequestMapping(value = "/cdTracks/{id}", method = RequestMethod.GET)
	public String getAllTracks(@PathVariable("id") int id, Model model) {
		logger.debug("Inside CdLibraryController getAllTracks");
		
		model.addAttribute("cdTracks", cdLibraryManager.getAllTracksForCd(id));
		return "CdTracksDisplay";
	}
}
