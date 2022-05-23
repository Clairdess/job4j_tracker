package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime itemLocalDate = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = itemLocalDate.format(formatter);
        System.out.println(currentDateTimeFormat);

        Item toStringItem = new Item();
        toStringItem.setId(123);
        toStringItem.setName("ToString");
        System.out.println(toStringItem);
    }
}
