package com.kodilla.beanlifecycle;

import com.kodilla.beanlifecycle.domain.Student;
import com.kodilla.beanlifecycle.utils.RandomString;

public class StudentMain {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Student student = new Student(RandomString.create(18));
            System.out.println(student.getIndexNumber() + ": " + student.hashCode());
        }


    }
}
