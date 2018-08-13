package com.dingyun.springbootcdm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DinGYun
 * 所有界面  以及所有准备工作
 */
@Controller
@RequestMapping("/base")
public class BaseController {


    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/awelcome")
    public String awelcome() {
        return "admin/welcome";
    }

    @RequestMapping("/swelcome")
    public String swelcome() {
        return "student/welcome";
    }

    @RequestMapping("/twelcome")
    public String twelcome() {
        return "teacher/welcome";
    }

    @RequestMapping("/clazzList")
    public String clazzList() {
        return "other/clazzList";
    }

    @RequestMapping("/courseList")
    public String courseList() {
        return "other/courseList";
    }

    @RequestMapping("/examList")
    public String examList() {
        return "other/examList";
    }

    @RequestMapping("/gradeList")
    public String gradeList() {
        return "other/gradeList";
    }


    @RequestMapping("/student")
    public String student() {
        return "student/student";
    }

    @RequestMapping("/examStudentList")
    public String examStudentList() {
        return "student/examStudentList";
    }

    @RequestMapping("/studentList")
    public String studentList() {
        return "student/studentList";
    }

    @RequestMapping("/studentNoteList")
    public String studentNoteList() {
        return "student/studentNoteList";
    }

    @RequestMapping("/studentPersonal")
    public String studentPersonal() {
        return "student/studentPersonal";
    }


    @RequestMapping("/teacher")
    public String teacher() {
        return "teacher/teacher";
    }

    @RequestMapping("/examTeacherList")
    public String examTeacherList() {
        return "teacher/examStudentList";
    }

    @RequestMapping("/teacherList")
    public String teacherList() {
        return "teacher/teacherList";
    }

    @RequestMapping("/teacherNoteList")
    public String teacherNoteList() {
        return "teacher/teacherNoteList";
    }

    @RequestMapping("/teacherPersonal")
    public String teacherPersonal() {
        return "teacher/teacherPersonal";
    }


    @RequestMapping("/admin")
    public String admin() {
        return "other/admin";
    }

    @RequestMapping("/adminPersonal")
    public String adminPersonal() {
        return "other/adminPersonal";
    }


}


