package com.emine.controller;

import com.emine.dto.DtoStudent;
import com.emine.dto.DtoStudentIU;
import com.emine.entities.Student;

import java.util.List;

public interface IStudentController {
 public DtoStudent saveStudent (DtoStudentIU dtoStudentIU);
 public List<DtoStudent> getAllStudents();
 public DtoStudent getStudentById(Integer id);
 public void deleteStudent(Integer id);
 public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);
}
