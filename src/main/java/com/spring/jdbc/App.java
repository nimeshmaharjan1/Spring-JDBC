package com.spring.jdbc;

import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class App {
     public static void main(String[] args) {

         ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       /*  JdbcTemplate template1 = (JdbcTemplate) context.getBean("jdbcTemplate");

         //insert query
         String query1 ="insert into student(id, name, city) values (?,?,?)";

         //fire query
         int result1 = template1.update(query1, 3, "Naresh Maharjan", "Kathmandu");
         System.out.println("Record inserted = "+ result1);*/
         StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
         Student student = new Student();
         student.setStudentId(4);
         student.setstudentName("Hero");
         student.setStudentCity("Lalitpur");
         int student1Result = studentDao.insert(student);
         System.out.println(student1Result + "Added");
     }
}
