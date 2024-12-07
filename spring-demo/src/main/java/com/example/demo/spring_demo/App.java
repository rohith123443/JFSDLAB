package com.example.demo.spring_demo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring Configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Get Employee Bean and Print
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        // Get Course Bean and Print
        Course course = (Course) context.getBean("course");
        System.out.println(course);
    }
}
