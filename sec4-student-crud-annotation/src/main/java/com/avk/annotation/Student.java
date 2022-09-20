package com.avk.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="regd_no")
	private int regdno;
	
	@Column(name="s_name")
	private String sname;
	
	@Column(name="s_cgpa")
	private int cgpa;
	
	public Student() {
		super();
	}
	
	public Student( String sname, int cgpa) {
		super();
		this.sname = sname;
		this.cgpa = cgpa;
	}
	
	public Student(int regdno, String sname, int cgpa) {
		super();
		this.regdno = regdno;
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
