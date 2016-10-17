package com.cisc181.core;

import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exception.PersonException;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cisc181.eNums.eMajor;

import exception.AreaPerimeterException;

public class Student extends Person {

	private eMajor Major;
	private UUID StudentID;
	
	public eMajor getMajor ( )
    {
        return this.Major;
    }
    public void setMajor (eMajor Major)
    {
        this.Major = Major;    
    }
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Marjor,
			String Address, String Phone_number, String Email) throws com.cisc181.core.PersonException
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.Major = Major;
	}
	
	
	
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}