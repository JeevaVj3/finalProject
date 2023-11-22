package com.onesoft.finalProject.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.finalProject.doa.FinalProjectDao;
import com.onesoft.finalProject.entity.FinalProject;

@Service
public class FinalProjectService {
	
	@Autowired
	FinalProjectDao fd;

	public String post(List<FinalProject> a) {
		return fd.post(a);
	}

	public FinalProject get(int id) {
		return fd.get(id);
	}

}
