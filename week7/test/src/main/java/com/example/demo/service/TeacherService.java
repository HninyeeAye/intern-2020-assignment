package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TeacherEntity;
import com.example.demo.repository.TeacherRepository;


@Service
public class TeacherService {
	@Autowired
TeacherRepository teacherRepository;
	
	

	public List<TeacherEntity> getTeacher() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}
	public TeacherEntity addTeacher(TeacherEntity teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}
	public TeacherEntity save(TeacherEntity teacher) {
		return teacherRepository.save(teacher);
	}
	public List<TeacherEntity> searchTeacher(String name,String phoneNo){
		return teacherRepository.searchEntity(name, phoneNo);
	}
	public TeacherEntity findById(long id) {
		return teacherRepository.findById(id).orElse(null);
	}
	

	
	
}
