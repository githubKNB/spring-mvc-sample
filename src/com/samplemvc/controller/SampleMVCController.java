/**
 * 
 */
package com.samplemvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samplemvc.dto.PageDTO;

/**
 * @author niranjan
 *
 */
@Controller
public class SampleMVCController {

	@RequestMapping("/index")
	public ModelAndView indexPage(){
		PageDTO pageDTO = new PageDTO("Index Page");
		pageDTO.setPageMessage("This is the Index Page.");
		return new ModelAndView("samplepage","pageData",pageDTO);
	}
	
	@RequestMapping("/secondpage")
	public ModelAndView secondPage(){
		PageDTO pageDTO = new PageDTO("Second Page");
		pageDTO.setPageMessage("This is the Second Page.");
		return new ModelAndView("samplepage","pageData",pageDTO);
	}
}
