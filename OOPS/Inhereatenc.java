package OOPS;

public class Inhereatenc {
    public static void main(String[] args) {
        Dog kity = new Dog();
        kity.walk();
        System.out.println(kity);
    }

}

class Animal {
    void eat() {
        System.out.println("It eats");
    }

    void breat() {
        System.out.println("It breaths");
    }
}

class Fish extends Animal {
    int wings;

    void swim() {
        System.out.println("It can swim");
    }

    int wings(int w) {
        return this.wings = w;
    }
}

class Mammel extends Animal {
    int legs;

    void walk() {
        System.out.println("It can walk");
    }

    int wings(int l) {
        return this.legs = l;
    }
}

class Birds extends Animal {
    int wing;

    void fly() {
        System.out.println("It can fly");
    }

    int wings(int w) {
        return this.wing = w;
    }
}

class Tuna extends Fish {
    void dangur() {
        System.out.println("it is danguras");
    }
}

class Dog extends Mammel {
    void bark() {
        System.out.println("it can barke");
    }
}