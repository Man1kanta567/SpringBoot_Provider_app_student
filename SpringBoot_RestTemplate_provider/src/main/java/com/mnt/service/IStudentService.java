package com.mnt.service;

import java.util.List;

import com.mnt.model.Student;

public interface IStudentService 
{
	
	 String deleteOnerecord(Integer id);
	
      List<Student> fetchAllRecords();

      Student fetchOneRecord(Integer id);
        
      Student insertOneRecord(Student student);
      
      boolean existsById(Integer id);
}
