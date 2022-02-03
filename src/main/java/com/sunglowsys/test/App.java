package com.sunglowsys.test;

import com.sunglowsys.bean.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext ();
        context.refresh ();

        context.scan ("com.sunglowsys.bean");

        Student student = context.getBean (Student.class);
        student.start ();
        student.hello ();
        context.close ();
    }
}
