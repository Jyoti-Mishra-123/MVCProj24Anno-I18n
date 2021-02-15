package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Person;

@Controller
public class PersonController {
	
	@GetMapping("/person")
	public String showFormPage(@ModelAttribute("perFrm") Person person) {
		
		return "person_form";
	}
	
	@PostMapping("/person")
	public String handleForm(Map<String,Object> map,@ModelAttribute("perFrm")Person person) {
		   
		  
		  return "register_success";
		  
		  }
	

}
