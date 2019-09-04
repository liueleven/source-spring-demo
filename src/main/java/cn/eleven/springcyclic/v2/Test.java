package cn.eleven.springcyclic.v2;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: spring demo
 * @date: 2019-08-26 14:12
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-ioc.xml");
        StudentA studentA1 = (StudentA) context.getBean("studentA");
        StudentA studentA2 = (StudentA) context.getBean("studentA");
        // 输出的结果是一样的
        System.out.println("studentA1: " + studentA1);
        System.out.println("studentA2: " + studentA2);



    }

}
