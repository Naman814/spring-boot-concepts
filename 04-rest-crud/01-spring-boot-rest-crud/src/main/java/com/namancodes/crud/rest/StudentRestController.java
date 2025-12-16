package com.namancodes.crud.rest;

import com.namancodes.crud.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define  @postConstruct to load student data ...only once
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Naman","Vijay"));
        theStudents.add(new Student("Ajay","Raj"));
        theStudents.add(new Student("Laksh","Sachdeva"));
    }


    @GetMapping("/students")
    public List<Student> getStudents(){

        // Jackson works in background to convert students objects to JSON data
        return theStudents;
    }

    // retrieving single student - url pathVariable and argument variable should be same.
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if(studentId >= theStudents.size() || studentId<0 ){
            throw new StudentNotFoundException("Student id not found - "+studentId);
        }

        return theStudents.get(studentId);
    }

}
