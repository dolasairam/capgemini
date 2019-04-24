package com.capg.servlet.lab3.service;

import java.util.List;

import com.capg.servlet.lab3.bean.Training;
import com.capg.servlet.lab3.dao.ITrainingdao;
import com.capg.servlet.lab3.dao.Trainingdao;
/**
**
**@author : Dola Sai Ram
**
**/


public class Trainingservice implements ITrainingservice {

	ITrainingdao dao=new Trainingdao();
	@Override
	public List<Training> ShowTraining() {
		return dao.ShowTraining() ;
	}

	@Override
	public String UpdateTraining(int id, int seats) {
		if(id<0 || seats<0)
			return "Invalid Values";
		else
			return dao.UpdateTraining(id, seats);
	}

	
}
