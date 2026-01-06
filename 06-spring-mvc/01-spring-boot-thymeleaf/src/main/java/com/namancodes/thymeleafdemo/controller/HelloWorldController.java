package com.namancodes.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // controller method to show initial HTML
    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // controller method to process the HTML
    // RequestMapping supports all types - GET,POST...
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // read the request parameter from HTML form
        String theName = request.getParameter("studentName");

        // convert data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result  = "Yo!" + theName;

        model.addAttribute("message",result);

        return "helloworld";
    }

    @PostMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){

        // convert data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result  = "Hey Buddy v3 !" + theName;

        model.addAttribute("message",result);

        return "helloworld";
    }



}
