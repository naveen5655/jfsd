package com.avk;

public class Student {
	
	private int regdno;
	private String sname;
	private int cgpa;
	
	public Student() {
		super();
		
	}
	public Student(String sname, int cgpa) {
		super();
		this.sname = sname;
		this.cgpa = cgpa;
	}
	public int getRegdno() {
		return regdno;
	}
	public void setRegdno(int regdno) {
		this.regdno = regdno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getCgpa() {
		return cgpa;
	}
	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	
	

}
