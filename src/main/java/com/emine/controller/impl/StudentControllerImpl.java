package com.emine.controller.impl;

import com.emine.controller.IStudentController;
import com.emine.entities.Student;
import com.emine.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {
    @Autowired
    private IStudentService studentService;

    //Uses DTO
    @PostMapping(path = "/save")
    @Override
    public Student saveStudent (@RequestBody Student student){
     return studentService.saveStudent(student);
 }
}
