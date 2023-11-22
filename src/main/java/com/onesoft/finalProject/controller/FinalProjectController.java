package com.onesoft.finalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onesoft.finalProject.controller.service.FinalProjectService;
import com.onesoft.finalProject.entity.FinalProject;

@Controller
@RequestMapping("new")
public class FinalProjectController {
	@Autowired
	FinalProjectService fs;
	
	@PostMapping("postall")
	public String post(@RequestBody List<FinalProject> a) {
		return fs.post(a);
	}
	
	@GetMapping("get/{id}")
	public FinalProject get(@PathVariable int id) {
		return fs.get(id);
	}

}
