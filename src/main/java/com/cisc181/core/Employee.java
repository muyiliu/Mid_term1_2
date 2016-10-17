package com.cisc181.core;
import java.util.Date;

public class Employee extends Person implements java.io.Serializable{

    private String office;
    private double salary;
    private Date hire;

    /**
     * Employee no-arg constructor
     * @since - 07/13/2014
     */
    public Employee() {
    }

    /**
     * <b>Employee Constructor</b> - Creates an instance of employee
     * @param FirstName
     * @param MiddleName
     * @param LastName
     * @param DOB
     * @param Address
     * @param Phone_number
     * @param Email
     * @param office
     * @param salary
     * @param hire
     * @throws PersonException 
     */
    public Employee(String FirstName, String MiddleName, String LastName,Date DOB,
			String Address, String Phone_number, String Email,
			String office, double salary, Date hire) throws PersonException
    {
    	super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
        this.office = office;
        this.salary = salary;
        this.hire = hire;
    }


    /**
     * 
     * @param office
     */
    public void setOffice(String office){
        this.office = office;
    }

    public String getOffice(){
        return this.office;
    }

    /**
     * setSalary - Setter for salary field
     * @param salary
     */
    public void setSalary(double salary){
        this.salary = salary;
    }

    /**
     * getSalary - Returns salary field
     * @return	   salary field
     */
    public double getSalary(){
        return this.salary;
    }

    /**
     * Set the Hire Date
     */
    public void setHire(Date hire){
        this.hire = hire;
    }

    public Date getHire(){
        return this.hire;
    }

}