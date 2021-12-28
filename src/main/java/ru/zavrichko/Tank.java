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

    public Tank(int i) {
        this.power = power;

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

    public Tank(int power, String model) {
        this.power = power;
        this.model = model;
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



/*
Длина корпуса, мм	5920
Ширина, мм	3000
Высота, мм	2405

Тип брони	стальная катаная гомогенная высокой твёрдости
Тип пушки	нарезная
Тип двигателя	В-2

Мощность двигателя, л. с.	500
Скорость по шоссе, км/ч	54

length, mm 5920
Width, mm 3000
Height, mm 2405

Armor type rolled steel homogeneous high hardness
Rifled gun type
Engine type B-2

Engine power, hp With. 500
Speed on the highway, km / h 54


*/