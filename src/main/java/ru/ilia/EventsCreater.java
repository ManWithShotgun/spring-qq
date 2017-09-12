package ru.ilia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EventsCreater {

    private Log log = LogFactory.getLog(EventsCreater.class);
    private Client client;
    private EventLogger logger;

    public EventsCreater(Client client, EventLogger logger) {
        this.client = client;
        this.logger = logger;
    }

    void logEvent(Event event, String msg) {
        if (client != null) {
            msg = msg.replaceAll(client.getId(), client.getFullName());
        }
        event.setMsg(msg);
        logger.logEvent(event);
    }
}
