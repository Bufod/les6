package com.company.pack2;

public class Dog extends Animal{

    public Dog(String color, String name, int age) {
        super(color, name, age);
    }

    @Override
    public String toString() {
        return super.toString() + "Object: Dog";
    }

    @Override
    void sound() {
        System.out.println("Гав");
    }
}
