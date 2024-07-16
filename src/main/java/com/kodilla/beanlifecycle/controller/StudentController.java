package com.kodilla.beanlifecycle.controller;

import com.kodilla.beanlifecycle.domain.Student;
import com.kodilla.beanlifecycle.utils.RandomString;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("")
    public String createStudents(@RequestParam(defaultValue = "10") int studentCount, @RequestParam(defaultValue = "20") int indexLength) throws NoSuchFieldException, IllegalAccessException {
        List<Student> students = new ArrayList<>();
        HashMap<Integer, String> studentMap = new HashMap<>();
        Field indexField = Student.class.getDeclaredField("indexNumber");
        indexField.setAccessible(true);

        String studentString = "";
        for(int i = 0; i < studentCount; i++) {
            Student student = new Student(RandomString.create(indexLength));
            students.add(student);
        }
        for (Student std : students) {
            studentMap.put(std.hashCode(), (String)indexField.get(std));
        }

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            studentString += entry.getKey() + " : " + entry.getValue() + "<br>";
        }

        return "Creating " + String.valueOf(studentCount) + " students with index length of " + String.valueOf(indexLength) + " characters.<br>" + studentString;
    }

}
