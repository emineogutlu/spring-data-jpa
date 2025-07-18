package com.emine.controller.impl;

import com.emine.controller.IStudentController;
import com.emine.entities.Student;
import com.emine.repository.StudentRepository;
import com.emine.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {
    @Autowired
    private IStudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    //Uses DTO
    @PostMapping(path = "/save")
    @Override
    public Student saveStudent (@RequestBody Student student){
     return studentService.saveStudent(student);
 }
  @GetMapping(path="/list")
    @Override
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
@GetMapping(path="/list/{id}")
    @Override
    public Student getStudentById(@PathVariable(name="id") Integer id) {
        return studentService.getStudentById(id);
    }
@DeleteMapping(path="/delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name="id") Integer id) {

           studentService.deleteStudent(id);


    }
@PutMapping(path ="/update/{id}" )
    @Override
    public Student updateStudent(@PathVariable(name="id") Integer id,@RequestBody Student updateStudent) {
        return studentService.updateStudent(id, updateStudent);
    }
}
