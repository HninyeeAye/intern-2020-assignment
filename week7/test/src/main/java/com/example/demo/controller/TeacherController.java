package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.GlobalConstant;
import com.example.demo.entity.TeacherEntity;
import com.example.demo.pojo.TeacherPojo;
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
		List<TeacherEntity> teachers= teacherService.getTeacher();
		return new BaseResponse(GlobalConstant.SUCCESS, teachers,GlobalConstant.Message.SUCCESS_MESSAGE);
	}
	@PostMapping (value = "/student")
	public BaseResponse addStudent(@RequestBody TeacherEntity teacher)
	{
	
		try {
       teacher = teacherService.save(teacher);
		}catch (Exception e) {
			System.out.println("Error occur "+e.getMessage());
			return new BaseResponse(1, null, "Error cannot create student");
		}
		return new BaseResponse(0, teacher, "Successfully created ");
	}
	@PutMapping(value = "/teacher")
	public TeacherEntity updateTeacher(@RequestBody TeacherPojo teacherPojo) {
		
		TeacherEntity teacher = teacherService.findById(teacherPojo.getId());
		if(teacher==null) {
			return null;
		}
		teacher.setPhoneNo(teacherPojo.getPhoneNo());
	
		return teacherService.save(teacher);
		
	}

}

