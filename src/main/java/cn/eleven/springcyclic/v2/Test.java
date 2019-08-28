package cn.eleven.springcyclic.v2;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @description: spring demo
 * @date: 2019-08-26 14:12
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-ioc.xml");
        StudentA studentA = (StudentA) context.getBean("studentA");
        Object studentB = context.getBean("studentB");
        System.out.println("studentA: " + studentA);
        System.out.println("studentB: " + studentB);


//        ClassPathResource resource = new ClassPathResource("spring/spring-ioc.xml");
//        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
//        int BeanCount = reader.loadBeanDefinitions(resource);
//        System.out.println("加载Bean数量：" + BeanCount);
//
//        StudentA studentA = (StudentA) defaultListableBeanFactory.getBean("studentA");
//        System.out.println(studentA);


    }

}
