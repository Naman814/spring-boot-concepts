package com.namancodes.thymeleafdemo.controller;

import com.namancodes.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    @Value("${app.countries}")
    private List<String> countries;

    @Value("${genders}")
    private List<String> genders;

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){



        // create a student object
        Student theStudent = new Student();

        // sending data from app.prop to model
        theModel.addAttribute("countries", countries);
        theModel.addAttribute("genders",genders);

        // add student object to the model
        theModel.addAttribute("student",theStudent);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

        //log the input data
        System.out.println("theStudent: "+theStudent.getFirstName()+" "+theStudent.getLastName()+" "+theStudent.getCountry()+" "+theStudent.getGender());

        return "student-confirmation";
    }

}
