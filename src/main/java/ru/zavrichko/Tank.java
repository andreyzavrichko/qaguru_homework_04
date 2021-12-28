package ru.zavrichko;

public class Tank {
    String model;
    int length;
    int width;
    int height;
    int speed;
    int power;
    String armor;
    String gunType;
    String engineType;

    public Tank(String model, int length, int width, int height, int speed, int power, String armor, String gunType, String engineType) {
        this.model = model;
        this.length = length;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.power = power;
        this.armor = armor;
        this.gunType = gunType;
        this.engineType = engineType;
    }

    // model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // width
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // height
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // power
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // armor
    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    // gunType
    public String getGunType() {
        return gunType;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }

    // engineType
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void sayModel() {
        System.out.println("Модель: " + model);
    }

    public void sayLength() {
        System.out.println("Длина: " + length);
    }

    public void sayWidth() {
        System.out.println("Ширина: " + width);
    }

    public void sayHeight() {
        System.out.println("Высота: " + height);
    }

    public void saySpeed() {
        System.out.println("Скорость: " + speed);
    }

    public void sayPower() {
        System.out.println("Мощность двигателя: " + power);
    }

    public void sayArmor() {
        System.out.println("Тип брони: " + armor);
    }

    public void sayGunType() {
        System.out.println("Тип вооружения: " + gunType);
    }

    public void sayEngineType() {
        System.out.println("Тип двигателя: " + engineType);
    }
}
