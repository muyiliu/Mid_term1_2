package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

public class Section {
	
	
	private UUID CourseID;
	private UUID SectionID;
	private UUID SemesterID;
	private int RoomID;
	
	public Section(){
		
	}
	
	public Section(UUID CourseID, UUID SemesterID, int RoomID ) {
		this.CourseID = CourseID;
		this.SectionID = SectionID;
		this.SemesterID = UUID.randomUUID();
		this.RoomID = RoomID;
		
		
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}


	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

}
