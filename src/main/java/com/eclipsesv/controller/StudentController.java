//package com.eclipsesv.controller;
//
//import com.eclipsesv.model.Student;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.validation.Valid;
//import java.util.ArrayList;
//import java.util.List;
//
//
///**
// * Created by eclipse on 16/8/23.
// */
//@Controller
//@RequestMapping("/")
//public class StudentController {
//    @RequestMapping(method = RequestMethod.GET)
//    public String newRegistration(ModelMap model){
//        Student student = new Student();
//        model.addAttribute("student",student);
//        return "enroll";
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public String saveRegistration(@Valid Student student, BindingResult result,ModelMap model){
//        if(result.hasErrors()){
//            return "enroll";
//        }
//        model.addAttribute("success", "Dear " + student.getFirstName() + " you've registrated suceessfully!");
//        return "success";
//    }
//
//    @ModelAttribute("selection")
//    public List<String> intitializSelection(){
//        List<String> sections = new ArrayList<String>();
//        sections.add("Graduate");
//        sections.add("Post Graduate");
//        sections.add("Research");
//        return sections;
//    }
//
//
//    @ModelAttribute("country")
//    public List<String> initializeCountry(){
//        List<String> countries = new ArrayList<String>();
//        countries.add("CHINA");
//        countries.add("CANADA");
//        countries.add("FRANCE");
//        countries.add("GERMANY");
//        countries.add("ITALY");
//        countries.add("OTHER");
//        return countries;
//    }
//
//    @ModelAttribute("subject")
//    public List<String> initializeSubjects() {
//
//        List<String> subjects = new ArrayList<String>();
//        subjects.add("Physics");
//        subjects.add("Chemistry");
//        subjects.add("Life Science");
//        subjects.add("Political Science");
//        subjects.add("Computer Science");
//        subjects.add("Mathmatics");
//        return subjects;
//    }
//
//}
