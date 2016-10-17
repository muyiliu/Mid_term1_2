package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

import exception.AreaPerimeterException;

public class PersonException extends Exception {
	
		Person student1;
		public PersonException(Person Student1, String message){
			super(message);
			this.student1 = student1;
	}
	
	
}
