package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	void add(Student s);

	List<Student> display();

	void delete(int roll);

	Student update(int roll, Student s);
	
	void addAll(List<Student> s);
}
