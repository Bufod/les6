package com.company.pack2;

public class Cat extends Animal{

    public Cat(String color, String name, int age) {
        super(color, name, age);
    }

    @Override
    public String toString() {
        return super.toString() + "Object: Cat";
    }

    @Override
    void sound() {
        System.out.println("Мяу");
    }
}