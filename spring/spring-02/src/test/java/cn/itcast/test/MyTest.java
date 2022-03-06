package cn.itcast.test;

import cn.itcast.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello)applicationContext.getBean("hello");
        System.out.println(hello.getName());
    }
}
