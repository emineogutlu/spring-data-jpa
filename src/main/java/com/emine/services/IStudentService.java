package com.emine.services;

import com.emine.entities.Student;

import java.util.List;

public interface IStudentService {
    Student saveStudent (Student student);
    public List<Student> getAllStudents();

    public Student getStudentById(Integer id);
    public void deleteStudent(Integer id);

    public Student updateStudent(Integer id ,Student updatedStudent);
}
