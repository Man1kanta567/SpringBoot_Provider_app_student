package com.mnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mnt.model.Student;
import com.mnt.service.IStudentService;

@RestController
public class Student_Controller {

	@Autowired
	private IStudentService service;
	
	@PostMapping("/insertStudent")
	private String insertOneStudentRecord(@RequestBody Student student)
	{
		return service.insertOneRecord(student).toString();
	}
	
	@GetMapping("/fetchAll")
	private List<Student> getAllStudentRecords()
	{
		return service.fetchAllRecords();
	}
	
	@GetMapping("/fetchOne/{id}")
	private Student getOneStudentRecord(@PathVariable String id)
	{   Integer studentId=Integer.parseInt(id);
		return service.fetchOneRecord(studentId);
	}
	
	@DeleteMapping("/deleteOne/{id}")
	private String deleteOneStudentrecord(@PathVariable Integer  id)
	{
		return service.deleteOnerecord(id);
	}
	
	
}
