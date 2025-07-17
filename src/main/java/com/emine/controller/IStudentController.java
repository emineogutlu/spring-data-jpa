package com.emine.controller;

import com.emine.entities.Student;

import java.util.List;

public interface IStudentController {
 public Student saveStudent (Student student);
 public List<Student> getAllStudents();
}
