package ru.ilia;

import java.util.ArrayList;

public class CacheFileEventLogger extends FileEventLogger {
    private int size;
    private ArrayList<Event> listEvents;

    public CacheFileEventLogger(int size) {
        this.size = size;
        listEvents = new ArrayList<>();
    }

    @Override
    public void logEvent(Event event) {
        if (listEvents.size() >= size) {
            System.out.println("CACHE DOWN");
            listEvents.add(event);
            writeAndClear();
        } else {
            listEvents.add(event);
        }
    }

    private void destroy() {
        System.out.println("destroy: " + CacheFileEventLogger.class);
        if (!listEvents.isEmpty()) {
            writeAndClear();
        }
    }

    private void writeAndClear() {
        for (Event event1 : listEvents) {
            super.logEvent(event1);
        }
        listEvents.clear();
    }
}
