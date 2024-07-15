package com.kodilla.beanlifecycle.domain;

public class Student {
    private String indexNumber;

    public Student(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
