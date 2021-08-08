package com.mnt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mnt.model.Student;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer>{

}
