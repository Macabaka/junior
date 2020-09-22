package com.soft1851.cloud.study.controller;

import com.soft1851.cloud.study.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author Johnny
 * @Date: 2020/9/14 08:17
 * @Description:
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @GetMapping(value = "/one")
    public Student getOneStudent(){
        return new Student(1,"123");
    }

    @GetMapping(value = "/list")
    public List<Student> getStudentList(){
        Student[] students = new Student[]{
                new Student(1,"小明"),
                new Student(2,"小红"),
                new Student(3,"小华")
        };
        return Arrays.asList(students);
    }

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") long id){
        return id+"号测试接口";
    }

    @GetMapping("/update/{name}")
    public String update(@PathVariable("name") String name){
        return name;
    }


    @PostMapping("/save")
    public String save(@RequestBody Student student){
        return "PostMapping测试接口";
    }


}
