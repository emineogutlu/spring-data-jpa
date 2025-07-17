package com.emine.services.impl;

import com.emine.controller.IStudentController;
import com.emine.entities.Student;
import com.emine.repository.StudentRepository;
import com.emine.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        studentRepository.save(student);
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
       List<Student>studentList= studentRepository.findAll();
        return studentList;
    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> optional=  studentRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
}
