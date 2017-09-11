package ru.ilia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EventsCreater {

    private Log log = LogFactory.getLog(EventsCreater.class);
    private Client client;
    private ConsoleEventLogger logger;
    private Event event;

    public void setEvent(Event event) {
        this.event = event;
    }

    public EventsCreater(Client client, ConsoleEventLogger logger) {
        this.client = client;
        this.logger = logger;
    }

    void logEvent(String msg) {
        if (client != null) {
            msg = msg.replaceAll(client.getId(), client.getFullName());
        }
        event.setMsg(msg);
        logger.logEvent(event);
    }
}
