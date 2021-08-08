package com.mnt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnt.model.Student;
import com.mnt.repo.IStudentRepo;

@Service
public class StudentService implements IStudentService{
	
	@Autowired
	private IStudentRepo repo;

	@Override
	public String deleteOnerecord(Integer id) {
		if(existsById(id))
		{
		repo.deleteById(id);
		  return "The Student with "+id+" is successfully deleted";
		}
		return "There is no Student Record with the id "+id;
	}

	@Override
	public List<Student> fetchAllRecords() {
		return repo.findAll();
		
	}

	@Override
	public Student fetchOneRecord(Integer id) {
		if (existsById(id)) {
			Optional<Student> opt = repo.findById(id);
			if (opt.isPresent()) {
				return opt.get();
			}
		}
		return null;
	}

	@Override
	public Student insertOneRecord(Student student) {
	  return repo.save(student);
		
	}

	@Override
	public boolean existsById(Integer id) {
		boolean flag=repo.existsById(id)?true:false;
		return flag;
	}

}
