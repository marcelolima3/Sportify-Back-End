package com.Sportify.DAO;

import com.Sportify.Entities.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDAO {

    private static Map<Integer, Student> students = new HashMap<Integer, Student>(){
        {
            put(1, new Student(1, "Jonh", "Computer Science"));
            put(2, new Student(2, "Ana", "Finance"));
            put(3, new Student(3, "Alex", "Maths"));
        }
    };

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public void deleteStudentById(int id) {
        students.remove(id);
    }

    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(s.getId(), s);
    }

    public void insertStudnet(Student student) {
        this.students.put(student.getId(), student);
    }
}
