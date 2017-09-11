package ru.ilia;

public class MailEventLogger implements EventLogger {
    @Override
    public void logEvent(Event event) {
        System.out.println("SEND EMAIL :: " + event);
    }
}
