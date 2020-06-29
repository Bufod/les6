package com.company.pack2;

public class Main {

    static void clickAnimal(Animal animal){
        animal.sound();
    }

    public static void main(String[] args) {

        Animal[] zoo = new Animal[3];

        zoo[0] = new Cat("Черный", "Барсик", 2);
        zoo[1] = new Dog("Коричневый", "Шарик", 3);
        zoo[2] = new Lion("Желтый", "Лев", 1);

        for(Animal animal : zoo)
            clickAnimal(animal);

    }
}
