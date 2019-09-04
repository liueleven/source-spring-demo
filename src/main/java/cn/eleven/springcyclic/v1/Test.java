package cn.eleven.springcyclic.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 循环依赖 demo
 * @date: 2019-08-26 14:12
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-ioc-cyclic.xml");
        StudentA studentA = (StudentA) context.getBean("studentA");
        System.out.println(studentA);
    }
}
