package com.qf.oa.controller;


import com.qf.oa.entity.Student;
import com.qf.oa.service.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController  {

    @Autowired
    private IStudent stuSrtvice;
@RequestMapping("/queryAll")
@ResponseBody
    public String queryAll(){
    List<Student> students = stuSrtvice.queryAll();
    for (Student student : students) {
        System.out.println(student);
    }
        return "ok11";
    }
}
