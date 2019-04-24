package com.capg.servlet.lab3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.capg.servlet.lab3.bean.Training;
import com.capg.servlet.lab3.ui.MyConnection;
/**
**
**@author : Dola Sai Ram
**
**/


public class Trainingdao implements ITrainingdao {

	Connection con=MyConnection.getConnection();
	@Override
	public List<Training> ShowTraining() {
		List<Training> li=new ArrayList<Training>();
		Statement s=null;
		ResultSet rs=null;
		try {
			s = con.createStatement();
			rs = s.executeQuery("select * from training");
			while(rs.next())
			{
				li.add(new Training(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			}
			return li;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String UpdateTraining(int id,int seats) {
		PreparedStatement ps=null;
		String res="";
		try {
			ps=con.prepareStatement("update training set AVAILABLESEATS=? where trainingid=?");
			ps.setInt(1, seats);
			ps.setInt(2,id);
			int x=ps.executeUpdate();
			if(x>0)
				res="Updated Data";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			res="Wrong Values";
		}
		return res;
	}

	
}
