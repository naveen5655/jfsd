package com.avk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@Column
	private int pID;
	
	@Column
	private String pName;
	
	@Column
	private double pCost;
	
	
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpCost() {
		return pCost;
	}
	public void setpCost(double pCost) {
		this.pCost = pCost;
	}
	
	

}
