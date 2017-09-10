package ru.ilia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ILIA on 10.09.2017.
 */
public class Main {
    private Log log = LogFactory.getLog(Main.class);
    private Client client;
    private ConsoleEventLogger logger;

    void logEvent(String msg) {
        if (client != null) {
            msg = msg.replaceAll(client.getId(), client.getFullName());
        }
        logger.logEvent(msg);
    }

    public static void main(String[] args) {
        Main app = new Main();

        app.client = new Client("1", "FullName");
        app.logger = new ConsoleEventLogger();
        app.logEvent("Message from user 1");

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-config.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
        app.log.info("das");

    }
}
