package ru.zavrichko;

public class First {
    public static void main(String[] args) {

        // Create first model
        Tank tankFirst = new Tank("T-34", 2000, 1000, 500, 200, 500, "test3", "test2", "test1");
           tankFirst.setArmor("rolled steel homogeneous high hardness");
           tankFirst.setPower(500);
           tankFirst.setEngineType("B-15");
           tankFirst.setGunType("Rifled");
           tankFirst.setHeight(4800);
           tankFirst.setLength(5400);
           tankFirst.setWidth(3400);
           tankFirst.setModel("T-34");
           tankFirst.setSpeed(38);

        // First method
        tankFirst.sayPower();
        tankFirst.sayModel();
        tankFirst.sayArmor();
        tankFirst.sayEngineType();
        tankFirst.sayHeight();
        tankFirst.sayLength();
        tankFirst.sayGunType();
        tankFirst.saySpeed();
        tankFirst.sayWidth();
    }
}
