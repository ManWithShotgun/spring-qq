package ru.ilia.helloworld;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static Log log = LogFactory.getLog(ru.ilia.Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        printBeansNames(context);

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
    }
    private static void printBeansNames(ApplicationContext context) {
        System.out.println("Beans: ");
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
