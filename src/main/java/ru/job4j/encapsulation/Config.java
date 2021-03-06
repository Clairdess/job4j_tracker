package ru.job4j.encapsulation;

public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

    private String getProperty(String key) {
        return search(key);
    }

    public String search(String key) {
        return key;
    }

    public void print() {
        System.out.println(position);
    }
}
