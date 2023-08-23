package com.greatlearning.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	 
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	//Set up mapping between teacher and teacherDetails table
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="teacher_detail_id")
	private TeacherDetails teacherDetails;
	
	public Teacher() {
		
	}
	
	 

	public Teacher(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TeacherDetails getTeacherDetails() {
		return teacherDetails;
	}

	public void setTeacherDetails(TeacherDetails teacherDetails) {
		this.teacherDetails = teacherDetails;
	}



	@Override
	public String toString() {
		return "Teacher [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", teacherDetails=" + teacherDetails + "]";
	}

	
	
	
	
}
