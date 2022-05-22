package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index <= size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        int size = 0;
        Item[] arr = new Item[items.length];
        for (Item item : items) {
            if (item != null) {
                arr[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(arr, size);
    }

    public Item[] findByName(String name) {
        int size = 0;
        Item[] arr = new Item[items.length];
        for (Item item : items) {
            if (item != null && item.getName().equals(name)) {
                arr[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(arr, size);
    }
}