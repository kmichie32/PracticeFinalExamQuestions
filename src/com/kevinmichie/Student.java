package com.kevinmichie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevinmichie on 8/9/16.
 */
public class Student {

    private String id;
    private ArrayList<String> students;

    public Student(String studentId) {
        this.id = studentId;
    }

    public void addToStudents(String studentName) {
        students.add(studentName);
    }

    public void removeStudents(String studentName) {
        students.remove(studentName);
    }

    public String getId() {
        return id;
    }

    public Map<String,Student> indexStudents(String id, ArrayList<Student> students) {
        Student student = new Student(id);
        Map studentsOrganized = new HashMap<String,Student>();
        for(Student person: students) {
            studentsOrganized.put(student.getId(), person);
        }
        return studentsOrganized;
    }
}
