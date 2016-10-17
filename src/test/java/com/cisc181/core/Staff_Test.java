package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;


public class Staff_Test {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testSalaryAverage() {
		ArrayList<Staff> StaffList = new ArrayList<Staff>();
		StaffList.add(new Staff("Walter", "Hartwell", "White", new Date(0), "308 South Commons", "(111)-111-1111",
				"WalterH@gmail.com", "10:00-17:00", 1, 100, new Date(1010), eTitle.ASSOCIATE));
		StaffList.add(new Staff("Charles","Lee","White",new Date(12),"315 South Commons","(222)-222-2222","Charles@gmail.com"
				,"10:00-17:00", 2,200,new Date(1020),eTitle.MANAGER));
		StaffList.add(new Staff("Maureen","May","Liu",new Date(12),"One Easton Court,APT 315","(333)-333-3333","Charles@gmail.com"
				,"10:00-17:00", 2,300,new Date(1021),eTitle.MANAGER));
		StaffList.add(new Staff("Xiaotian","Charles","Zhong",new Date(12),"One Easton Court,APT 301","(444)-444-4444","Charles@gmail.com"
				,"10:00-17:00", 2,400,new Date(1022),eTitle.SUPERVISOR));
		StaffList.add(new Staff("Pengzhi","Lee","Wang",new Date(12),"Drive Way,APT308","(555)-555-5555","Charles@gmail.com"
				,"10:00-17:00", 2,500,new Date(1023),eTitle.ASSOCIATE));
		
	
		double SalaryAverage = ((StaffList.get(0).getSalary() + StaffList.get(1).getSalary()
				+ StaffList.get(2).getSalary()
				+ StaffList.get(3).getSalary() + StaffList.get(4).getSalary())
				/ 5); 
		assertTrue(SalaryAverage == 300 );
	}

	@Test
	public void test2() throws PersonException{
		Date DOB = new Date(1);
		Date hireDate = new Date();
		Staff f = new Staff("FirstName", "MiddleName", "LastName",
				DOB, "Address", "Phone_number","Email",
				"officeHours", 2, 10000,hireDate,eTitle.ASSOCIATE);
		System.out.println(f.getPhone());
		}

	
	@Test
	public void test3() throws PersonException{
		Calendar birthDate = Calendar.getInstance();
		birthDate.set(1000,2,3);
		Date DOB = birthDate.getTime();
		Date hireDate = new Date();
		Staff g = new Staff("FirstName", "MiddleName", "LastName",
				DOB, "Address", "Phone_number","Email",
				"officeHours", 2, 10000,hireDate,eTitle.ASSOCIATE);
		System.out.println(g.getDOB());
	}
}
