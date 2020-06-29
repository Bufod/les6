package com.company.pack2;

public abstract class Animal {
    private String color,
            name;
    private int age;

    Animal(String color, String name, int age){
        this.color = color;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    void sound(){
        System.out.println("____");
    }
}
