package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.GlobalConstant;
import com.example.demo.entity.TeacherEntity;
import com.example.demo.response.BaseResponse;
import com.example.demo.service.TeacherService;



@RestController
public class TeacherController {
	
@Autowired
TeacherService teacherService;



	@GetMapping (value = "/teacher")
	public List<TeacherEntity> getTeacher() {
		return teacherService.getTeacher();
	}
	@GetMapping (value = "/teacher")
	public BaseResponse getStudent() {
		List<TeacherEntity> students= teacherService.getTeacher();
		return new BaseResponse(GlobalConstant.SUCCESS, students,GlobalConstant.Message.SUCCESS_MESSAGE);
	}
	

}

