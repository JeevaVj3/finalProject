package com.onesoft.finalProject.doa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.finalProject.entity.FinalProject;
import com.onesoft.finalProject.repository.FinalProjectRepository;

@Repository
public class FinalProjectDao {
	
	@Autowired
	FinalProjectRepository fr;

	public String post(List<FinalProject> a) {
		fr.saveAll(a);
		return "Stored";
	}

	public FinalProject get(int id) {
		return fr.findById(id).get();
	}

}
