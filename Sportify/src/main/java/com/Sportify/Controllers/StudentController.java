package com.Sportify.Controllers;

import com.Sportify.Entities.Student;
import com.Sportify.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping( method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteStudentById(@PathVariable("id") int id){
        studentService.deleteStudentById(id);
        return "Deleted";
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "Updated";
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
        return "Inserted";
    }
}
