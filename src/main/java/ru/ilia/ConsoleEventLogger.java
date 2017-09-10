package ru.ilia;

/**
 * Created by ILIA on 10.09.2017.
 */
public class ConsoleEventLogger {

    public void logEvent(String msg) {
        System.out.println(String.format("Msg event: %s", msg));
    }
}
