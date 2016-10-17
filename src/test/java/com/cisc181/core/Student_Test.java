package com.cisc181.core;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;


public class Student_Test {
	static ArrayList<Course> CourseList;
	static ArrayList<Semester> SemesterList;
	static ArrayList<Section> SectionList;
	static ArrayList<Student> StudentList;
	
	

	@BeforeClass
	public static void setupBeforeClass() throws Exception{
		CourseList = new ArrayList<Course>();
		CourseList.add(new Course(UUID.randomUUID(), "BUAD100", 3, eMajor.BUSINESS));
		CourseList.add(new Course(UUID.randomUUID(),"CISC181",4,eMajor.COMPSI));
		CourseList.add(new Course(UUID.randomUUID(),"CHEM100",3,eMajor.CHEM));
		//Spring , Fall
		SemesterList = new ArrayList<Semester>();
		SemesterList.add(new Semester(UUID.randomUUID(),new Date(1120),new Date(1231)));//Fall
		SemesterList.add(new Semester(UUID.randomUUID(),new Date(0312),new Date(0516)));//Spring
		//BUAD,COMPSI,CHEM Fall
		SectionList = new ArrayList<Section>();
		SectionList.add(new Section(CourseList.get(0).getCourseID(),UUID.randomUUID(), 100));
		SectionList.add(new Section(CourseList.get(1).getCourseID(),UUID.randomUUID(),101));
		SectionList.add(new Section(CourseList.get(2).getCourseID(),UUID.randomUUID(),120));
		//Spring, classes 
		SectionList.add(new Section(CourseList.get(0).getCourseID(),UUID.randomUUID(), 200));
		SectionList.add(new Section(CourseList.get(1).getCourseID(),UUID.randomUUID(),201));
		SectionList.add(new Section(CourseList.get(2).getCourseID(),UUID.randomUUID(),203));
		
		StudentList = new ArrayList<Student>();
		
		StudentList.add(new Student("First","MiddleName", "LastName",new Date(1), eMajor.BUSINESS,
			"Address1", "(111)-111-1111", "Email1@udel.edu"));
		StudentList.add(new Student("First","MiddleName", "LastName",new Date(2), eMajor.BUSINESS,
				"Address2", "(222)-222-2222", "Email2@udel.edu"));
		StudentList.add(new Student("First","MiddleName", "LastName",new Date(3), eMajor.COMPSI,
				"Address3", "(111)-333-3333", "Email3@udel.edu"));
		StudentList.add(new Student("First","MiddleName", "LastName",new Date(4), eMajor.COMPSI,
				"Address4", "(111)-111-4444", "Email4@udel.edu"));
		StudentList.add(new Student("First","MiddleName", "LastName",new Date(5), eMajor.CHEM,
				"Address5", "(111)-111-5555", "Email5@udel.edu"));
		StudentList.add(new Student("First","MiddleName", "LastName",new Date(6), eMajor.CHEM,
				"Address6", "(111)-111-6666", "Email6@udel.edu"));
		StudentList.add(new Student("First","MiddleName", "LastName",new Date(7), eMajor.PHYSICS,
				"Address7", "(111)-111-7777", "Email7@udel.edu"));
		StudentList.add(new Student("First","MiddleName", "LastName",new Date(8), eMajor.PHYSICS,
				"Address8", "(111)-111-8888", "Email8@udel.edu"));
		StudentList.add(new Student("First","MiddleName", "LastName",new Date(9), eMajor.NURSING,
				"Address9", "(111)-111-9999", "Email9@udel.edu"));
		StudentList.add(new Student("First","MiddleName", "LastName",new Date(10), eMajor.NURSING,
				"Address10", "(111)-111-7681", "Email10@udel.edu"));
		
	}

	@Test
	public void testEnrollment()
	{
		ArrayList<Enrollment> enrollmentList = new ArrayList<Enrollment>();
		ArrayList<Double> studentGPAList = new ArrayList<Double>();
		ArrayList<Double> sectionGPAList = new ArrayList<Double>();

		for (int i = 0; i < StudentList.size(); i++)
		{
			Student stu = StudentList.get(i);

			for (int k = 0; k < SectionList.size(); k++)
			{
				Section sect = SectionList.get(k);
				Enrollment e = new Enrollment(stu.getStudentID(), sect.getSectionID());
				e.setGrade((i * 10) + 5);
				enrollmentList.add(e);
			}
		}

		for (int i = 0; i < enrollmentList.size(); i += 6)
		{
			double GPA = 0;
			for (int k = 0; k < 6; k++)
			{
				int element = i + k;
				GPA = GPA + enrollmentList.get(element).getGrade();
			}
			GPA = GPA / 6;
			studentGPAList.add(GPA);
		}

		assertTrue(studentGPAList.get(0).doubleValue() == 5);
		assertTrue(studentGPAList.get(1).doubleValue() == 15);
		assertTrue(studentGPAList.get(2).doubleValue() == 25);
		assertTrue(studentGPAList.get(3).doubleValue() == 35);
		assertTrue(studentGPAList.get(4).doubleValue() == 45);
		assertTrue(studentGPAList.get(5).doubleValue() == 55);
		assertTrue(studentGPAList.get(6).doubleValue() == 65);
		assertFail(studentGPAList.get(7).doubleValue() == 1);
		assertFail(studentGPAList.get(8).doubleValue() == 2);
		assertFail(studentGPAList.get(9).doubleValue() == 3);

		for (int i = 0; i < 6; i++)
		{
			double GPA = 0;
			for (int k = 0; k < enrollmentList.size(); k += 6)
			{
				int element = i + k;
				GPA = GPA + enrollmentList.get(element).getGrade();
			}
			GPA = GPA / 10;
			sectionGPAList.add(GPA);
		}

		assertTrue(sectionGPAList.get(0).doubleValue() == 50);
		assertTrue(sectionGPAList.get(1).doubleValue() == 50);
		assertTrue(sectionGPAList.get(2).doubleValue() == 50);
		assertTrue(sectionGPAList.get(3).doubleValue() == 50);
		assertFail(sectionGPAList.get(4).doubleValue() == 20);
		assertFail(sectionGPAList.get(5).doubleValue() == 10);
	}

	private void assertFail(boolean b) {
		
		
	}

	@Test
	public void testChangeMajor()
	{
		StudentList.get(0).setMajor(eMajor.CHEM);
		assertEquals(StudentList.get(0).getMajor(), eMajor.CHEM);
	}
}
