package ru.ilia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ilia.helloworld.HelloWorld;

/**
 * Created by ILIA on 10.09.2017.
 */
public class Main {

    private static Log log = LogFactory.getLog(Main.class);


    public static void main(String[] args) {
//        EventsCreater app = new EventsCreater(
//                new Client("1", "FullName"),
//                new ConsoleEventLogger());
//
//        app.logEvent("Message from user 1");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        EventsCreater creater = context.getBean(EventsCreater.class);
        creater.logEvent("Message from user 1");
        creater.logEvent("Message from user 2");

    }


}
