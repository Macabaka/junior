package com.soft1851.cloud.study.handler;

import com.soft1851.cloud.study.entity.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Johnny
 * @Date: 2020/9/14 08:43
 * @Description:
 */
@RequestMapping("/consumer")
@RestController
public class StudentHandler {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/student/one")
    public Student getOneStudent() {
        return restTemplate.getForObject("http://johnnycc.com:8001/student/one", Student.class);
    }

    @GetMapping("/student/list")
    public List<Student> getStudentList() {
        return restTemplate.getForObject("http://johnnycc.com:8001/student/list", List.class);
    }

    @GetMapping("/student/find/{id}")
    public String findById(@PathVariable("id") long id) {
        return restTemplate.getForObject("http://johnnycc.com:8001/student/findById/{id}", String.class, id);
    }

    @GetMapping("/student/update")
    public String update(@RequestParam("name") String name){
        return restTemplate.getForObject("http://johnnycc.com:8001/student/update/"+name, String.class);
    }

    @PostMapping("/save")
    public String save(@RequestBody Student student){
       return  restTemplate.getForObject("http://johnnycc.com:8001/student/save",String.class,student);
    }
}
