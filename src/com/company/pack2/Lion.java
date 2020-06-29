package com.company.pack2;

public class Lion extends Animal {

    public Lion(String color, String name, int age) {
        super(color, name, age);
    }

    @Override
    public String toString() {
        return super.toString() + "Object: Lion";
    }

    @Override
    void sound() {
        System.out.println("Р-р-р!");
    }
}
