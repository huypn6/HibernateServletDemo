package com.demo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the classes database table.
 * 
 */
public class Classes implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	//bi-directional many-to-one association to Student
	private List<Student> students;

	public Classes() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}