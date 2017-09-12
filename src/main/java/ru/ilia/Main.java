package ru.ilia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ilia.helloworld.HelloWorld;

/**
 * Created by ILIA on 10.09.2017.
 */
public class Main {

    private static Log log = LogFactory.getLog(Main.class);


    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        EventsCreater creater = context.getBean(EventsCreater.class);

        Event event = context.getBean(Event.class);
        creater.logEvent(event, "Message from user 1");

        event = context.getBean(Event.class);
        creater.logEvent(event, "Message from user 2");

        event = context.getBean(Event.class);
        creater.logEvent(event, "Message from user 3");

        event = context.getBean(Event.class);
        creater.logEvent(event, "Message from user 4");

        event = context.getBean(Event.class);
        creater.logEvent(event, "Message from user 5");

        context.close();

    }


}
