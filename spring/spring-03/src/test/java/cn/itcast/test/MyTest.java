package cn.itcast.test;

import cn.itcast.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.toString());
    }
}
