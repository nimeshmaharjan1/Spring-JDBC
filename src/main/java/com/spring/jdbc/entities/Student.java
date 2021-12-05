package com.spring.jdbc;

public class Student {
    private int studentId;
    private String studentName;
    private String studentCity;

    public Student() {
        super();
    }

    public Student(int studentId, String studentName, String studentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "hello" + studentId + studentName + studentCity;
    }
}
