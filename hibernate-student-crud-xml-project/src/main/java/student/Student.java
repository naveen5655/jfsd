package student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	private int regdno;

	private String sname;
	private double cgpa;
	
	public Student() {
		super();
		
	}
	
	public Student(int regdno, String sname, double cgpa) {
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
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	

}
