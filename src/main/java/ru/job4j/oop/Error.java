package ru.job4j.oop;

public class Error {
    private String message;
    private boolean isActive;
    int status;

    Error() {

    }

    public Error(String message, boolean isActive, int status) {
        this.message = message;
        this.isActive = isActive;
        this.status = status;
    }

    public void printInfo() {
        System.out.println("Статус : " + status);
        System.out.println("Является ли активным: " + isActive);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error fatalError = new Error("fatalError", false, 404);
        Error memoryError = new Error("OutOffMemoryException", false, 503);
        Error arithmeticError = new Error("ArithmeticError", false, 503);
        fatalError.printInfo();
        memoryError.printInfo();
        arithmeticError.printInfo();
    }

}
