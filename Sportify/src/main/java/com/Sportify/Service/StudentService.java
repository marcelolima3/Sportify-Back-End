package com.Sportify.Service;

import com.Sportify.DAO.StudentDAO;
import com.Sportify.Entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    private StudentDAO studentDAO;

    public Collection<Student> getAllStudents(){
        return studentDAO.getAllStudents();
    }

    public Student getStudentById(int id){
        return studentDAO.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        studentDAO.deleteStudentById(id);
    }

    public void updateStudent(Student student){
        studentDAO.updateStudent(student);
    }

    public void insertStudent(Student student) {
        studentDAO.insertStudnet(student);
    }
}
