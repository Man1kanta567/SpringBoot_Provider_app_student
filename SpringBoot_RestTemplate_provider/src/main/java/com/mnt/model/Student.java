package com.mnt.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student_table")
public class Student 
{
   @Id
   @Column(name="student_Id")
   private Integer id;
   @Column(name="student_name")
   private String name;
   @Column(name="student_mail")
   private String mail;
   @ElementCollection
   @CollectionTable(name = "s_hobbies", joinColumns = @JoinColumn(name="student_Id"))
   @OrderColumn(name = "hobbies")
   @Column(name="student_hobbies")
   private List<String> hobbies;
}
