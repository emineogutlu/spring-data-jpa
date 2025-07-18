package com.emine.services;

import com.emine.dto.DtoStudent;
import com.emine.dto.DtoStudentIU;
import com.emine.entities.Student;

import java.util.List;

public interface IStudentService {
   public DtoStudent saveStudent (DtoStudentIU dtoStudentIU);
    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);
    public void deleteStudent(Integer id);

    public DtoStudent updateStudent(Integer id ,DtoStudentIU dtoStudentIU);
}
