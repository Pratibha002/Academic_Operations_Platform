package com.academics.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {
	
	@RequestMapping("/form")
	public String form() {
		
		return "form";
	}
	
	@RequestMapping("/welcome")
	public String welcome( ) {
		return "welcome";
	}
	
	
	@RequestMapping("/photoUpload")
	public String photoUpload() {
		return "photoUpload";
	}
	@RequestMapping("/admissionForm")
	public String admissionForm() {
		
		return "admissionForm";
	}	
	
	@RequestMapping(value ="/stusignup", method = RequestMethod.GET)
	public String stuSignup() {

		return "stuSignup";
	}
	
	@RequestMapping("/adLogin")
	public String adLogin() {

		return "adLogin";
	}
	
	@RequestMapping("/submitFees")
	public String submitFees() {
		
		return "submitFees";
	}
	
	@RequestMapping("/feesSummary")
	public String feesSummary() {
			
			return "feesSummary";
	}
	
	
	@RequestMapping("/feesReport")
	public String feesReport() {
			return "feesReport";
	}
	
	@RequestMapping("/feesReportGenerate")
	public String feesReportGenerate() {
		
		return "feesReport";
	}	
	
	@RequestMapping("/feesProcessing")
	public String feesProcessing() {
			
		
			return "redirect:/feesSummary";
	}
	
	
	
	@RequestMapping(value="/searchStudents")
	public String searchByBranch() {	
		
		return "studentsList";
	}
	
	@RequestMapping("/searchByRollNo")
	public String searchByRollNo() {
		
		return "studentsList";
	}
	
	@RequestMapping("/searchByClass")
	public String searchByClass() {
		
		return "studentsList";
	}
	
	@RequestMapping("/studentsList")
	public String studentsList() {
		
		return "studentsList";
	}
	
	
	@RequestMapping("/addStudents")
	public String addStudents() {
		
		return "registerStudents";
	}
	
	@RequestMapping("/updateStudents")
	public String updateStudent() {
		
		return "admissionForm";
	}
	
	
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent() {
		
		return "redirect:/studentsList";
	}
	
	

	@RequestMapping("/addStudentsToDb")
	public String addStudentsToDb() {
		
		return "redirect:/addStudents";
	}
	
	
	@RequestMapping(value="/saveAdmissison",method=RequestMethod.POST)
	public String saveAdmissison()  {
	
		return "redirect:/studentsList";
		
	}
	
	@RequestMapping("/customlogin")
	public String customLogin() {

		return "customLogin";
	}
	
	@ResponseBody
	@RequestMapping("/accessdenied")
	public String accessDenied() {
		
		return "Access Denied";
	}
}
