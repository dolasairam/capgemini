package com.capg.servlet.lab3.bean;
/**
**
**@author : Dola Sai Ram
**
**/

public class Training {

	private int tid;
	private String tname;
	private int Aseats;
	public Training() {}
	
	public Training(int tid, String tname, int aseats) {
		super();
		this.tid = tid;
		this.tname = tname;
		Aseats = aseats;
	}

	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getAseats() {
		return Aseats;
	}
	public void setAseats(int aseats) {
		Aseats = aseats;
	}
	
	
}
