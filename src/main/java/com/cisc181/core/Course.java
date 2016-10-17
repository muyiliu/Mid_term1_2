package com.cisc181.core;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	
	public Course(UUID CourseID, String CourseName, int GradePoints, eMajor Major){
		this.Major = Major;
		this.CourseID = CourseID;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}


	public UUID getCourseID() {
		return CourseID;
	}


	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}


	public String getCourseName() {
		return CourseName;
	}


	public void setCourseName(String courseName) {
		CourseName = courseName;
	}


	public int getGradePoints() {
		return GradePoints;
	}


	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}


	public eMajor getMajor() {
		return Major;
	}


	public void setMajor(eMajor major) {
		Major = major;
	}
	

}
