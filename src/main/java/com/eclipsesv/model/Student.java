//package com.eclipsesv.model;
//
//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotEmpty;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Past;
//import javax.validation.constraints.Size;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
///**
// * Created by eclipse on 16/8/23.
// */
//public class Student implements Serializable{
//    @Size(min = 3,max = 20)
//    private String firstName;
//
//    @Size(min = 3,max = 20)
//    private String lastName;
//
//
//
//    public Student() {
//    }
//
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//
//
//    @Override
//    public String toString() {
//        return "Student [firstName=" + firstName + ", lastName=" + lastName
//                +  "]";
//    }
//}
