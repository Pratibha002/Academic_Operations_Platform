package com.academics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	// @Autowired
	// public AdminDao adminDao;

	@RequestMapping("/classes")
	public String classes() {

		return "addClasses";

	}

	@RequestMapping("/addClasses")
	public String addClasses() {

		return "redirect:/classes";
	}

	@RequestMapping("/session")
	public String session() {

		return "addSession";
	}

	@RequestMapping("/addsession")
	public String addSession() {

		return "redirect:/session";
	}

	@RequestMapping("/category")
	public String category() {

		return "addCategory";
	}

	@RequestMapping("/addcategory")
	public String addCategory() {

		return "redirect:/category";
	}

	@RequestMapping("/feestype")
	public String feestype() {

		return "addFeesType";
	}

	@RequestMapping("/addfeestype")
	public String addfeestype() {

		return "redirect:/feestype";
	}

	@RequestMapping("/deletefeestype")
	public String delteFeesType() {

		return "redirect:/feestype";
	}

	@RequestMapping("/deleteclasses")
	public String delteClasses() {

		return "redirect:/classes";
	}

	@RequestMapping("/deletesession")
	public String delteSession() {

		return "redirect:/session";
	}

	@RequestMapping("/deletecategory")
	public String delteCategory() {

		return "redirect:/category";
	}

}
