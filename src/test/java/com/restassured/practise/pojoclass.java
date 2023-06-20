package com.restassured.practise;

public class pojoclass {
	
	int projectid;
	String pname;
	int teamsize;
	String status;
	
	public pojoclass(int projectid,String pname,int teamsize,String status) {
		this.pname=pname;
		this.projectid=projectid;
		this.teamsize=teamsize;
		this.status=status;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
