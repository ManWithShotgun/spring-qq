package ru.ilia;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private File file;
    private String fileName;

    @Override
    public void logEvent(Event event) {
        try {
            System.out.println("FILE :: " + event);
            FileUtils.writeStringToFile(file, event.toString()+"\n", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void init() throws IOException {
        System.out.println("init: "+ FileEventLogger.class);
        this.file = new File(fileName);
        if (!file.canWrite()) {
            throw new IOException("Can't write to file: " + fileName);
        }
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
