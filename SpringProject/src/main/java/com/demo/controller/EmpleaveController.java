package com.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.EmpleaveDetails;
import com.demo.service.EmpService;

@Controller
@RequestMapping("/")
public class EmpleaveController {
	@Autowired
	EmpService eserv;
	
	@GetMapping("")
	public String index() {
		return "index";
	}
	
	@GetMapping("/applyleave")
	public String applyLeave() {
		return "applyleave";
	}

	
	@PostMapping("/insert")
	public ModelAndView insertProduct(@RequestParam int empno, @RequestParam Date start,@RequestParam Date end,@RequestParam String type ,@RequestParam String reason) {
	   Date d=new Date();
		EmpleaveDetails p=new EmpleaveDetails(d,start,end,type,reason,empno);
		eserv.addnewleave(p);
		return new ModelAndView("redirect:/viewHistory");
		
	}
	
	@GetMapping("/viewHistory")
	public ModelAndView getAll() {
		EmpleaveDetails e=eserv.getall();
		return new ModelAndView("viewHistory","e",e);
	}

}
