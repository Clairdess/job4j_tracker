package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Clean Code", 431);
        Book second = new Book("Clean Architecture: A Craftsman's Guide to Software Structure", 432);
        Book third = new Book("Design Patterns: Elements of Reusable Object-Oriented Software", 395);
        Book fourth = new Book("Grokking Algorithms: An illustrated guide for programmers and other curious people", 256);

        Book[] books = new Book[]{first, second, third, fourth};
        for (Book book : books) {
            System.out.println(book);
        } System.out.println();

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println(book);
        } System.out.println();

        for (Book book : books) {
            if ("Clean Code".equals(book.getName())) {
                System.out.println(book);
            }
        }
    }
}
