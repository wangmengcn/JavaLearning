package com.eclipsesv.controller;

import com.eclipsesv.model.Member;
import com.eclipsesv.model.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by eclipse on 16/8/24.
 */
@Controller
@RequestMapping("/")
public class MemberController {
    @Autowired
    private MemberRepository repository;


    @RequestMapping(method = RequestMethod.GET)
    public String registerUser(ModelMap model){
        Member member = new Member();
        model.addAttribute("member",member);
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String newUser(@Valid Member member, BindingResult result, ModelMap model){
        Member olduser = repository.findByusername(member.getUsername());
        if(olduser!=null){
            return "login";
        }
        repository.save(member);
        System.out.println(member.getId());
        model.addAttribute("username",member.getUsername());
        return "chatroom";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/login")
    public String loginUser(@Valid Member member, BindingResult result, ModelMap model){
        Member currentUser = repository.findByusername(member.getUsername());
        System.out.println(currentUser.getId());
        if(currentUser.getPassword().equals(member.getPassword())){
            model.addAttribute("username",member.getUsername());
            return "chatroom";
        }
        return "login";
    }

}
