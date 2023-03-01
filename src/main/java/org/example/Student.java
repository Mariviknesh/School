package org.example;
import java.util.logging.*;

class Student{
    String name;
    String grade;
    double gpa;
    Logger log=Logger.getLogger("com.api.jar");
    Student(String name,String grade,double gpa)
    {
        this.name=name;
        this.grade=grade;
        this.gpa=gpa;
    }
    public void updateGpa(double upga)
    {
        gpa=upga;

    }
    public void display()
    {
        String s1="Student Name:"+this.name+"\n";
        String s2="Student Grade:"+this.grade+"\n";
        String s3="Student GPA:"+this.gpa+"\n";
        log.info(s1);
        log.info(s2);
        log.info(s3);
    }
}