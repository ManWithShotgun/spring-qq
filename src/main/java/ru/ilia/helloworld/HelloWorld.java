package ru.ilia.helloworld;

/**
 * Created by ILIA on 10.09.2017.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello ! " + name);
    }
}
