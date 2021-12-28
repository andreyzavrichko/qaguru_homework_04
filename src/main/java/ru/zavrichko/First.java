package ru.zavrichko;

public class First {
    public static void main(String[] args) {
        // Create first model
        Tank tankFirst = new Tank("T-34", 2000, 1000, 500, 200, 500, "test3", "test2", "test1");
        tankFirst.printInfo();

        // Second tank
        Tank tankSecond = new Tank("Пантера", 1000, 5000, 1800, 50, 100, "test1", "test2", "test3");
        tankSecond.printInfo();
    }
}
