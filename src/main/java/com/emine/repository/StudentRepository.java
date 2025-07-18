package com.emine.repository;

import com.emine.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository <Student,Integer>{


    //HQL:In Spring Data JPA, queries are written based on the class name and its field names.
    //@Query(value="from Student",nativeQuery=false)
    //SQL:In SQL, queries are constructed based on the table name and its column names.
    //@Query(value = "select * from student.student",nativeQuery = true)
    @Query(value="from Student",nativeQuery=false)
     List<Student> findAllStudents();
    @Query(value="from Student s Where s.id= :studentId")
   Optional<Student>  findStudentById(Integer studentId);
}

