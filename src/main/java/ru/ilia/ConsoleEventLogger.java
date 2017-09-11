package ru.ilia;

/**
 * Created by ILIA on 10.09.2017.
 */
public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event) {
        System.out.println(String.format("CONSOLE WRITER :: %s", event));
    }
}
