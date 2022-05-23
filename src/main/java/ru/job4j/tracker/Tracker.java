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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String name) {
        int count = 0;
        Item[] arr = new Item[items.length];
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(name)) {
                arr[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(arr, count);
    }

    public boolean replace(int id, Item item) {
        Item replacingItem = findById(id);
        if (replacingItem == null) {
            return false;
        }
        item.setId(replacingItem.getId());
        replacingItem = item;
        items[id - 1] = replacingItem;
        return true;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}