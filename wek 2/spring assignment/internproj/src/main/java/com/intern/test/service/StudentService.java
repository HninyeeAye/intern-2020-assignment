package com.intern.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.test.entity.Student;
import com.intern.test.repository.StudentRepository;

import antlr.collections.List;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public List getStudent() {
		return  (List) studentRepository.findAll();
	}
	
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}
	public Student findBy(Long id) {
		return studentRepository.findById(id).orElse(null);
	}
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
	
	

}
