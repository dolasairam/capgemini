package com.capg.servlet.lab3.dao;

import java.util.List;


import com.capg.servlet.lab3.bean.Training;
/**
**
**@author : Dola Sai Ram
**
**/


public interface ITrainingdao {

	public List<Training> ShowTraining();
	public String UpdateTraining(int id,int seats);
}
