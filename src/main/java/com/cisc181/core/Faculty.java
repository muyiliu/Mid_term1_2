package com.cisc181.core;

import java.util.Date;

public class Faculty extends Employee {

	private String officeHours;
	private int rank;

    public void setofficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public String getofficeHours(){
        return this.officeHours;
    }
    
    public void setrank(int rank){
        this.rank = rank;
    }

    public int getrank(){
        return this.rank;
    }    
    
	public Faculty(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.officeHours = officeHours;
		this.rank = rank;
	}

}