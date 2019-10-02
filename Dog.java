package com.week6;

public class Dog extends Canine implements Pet {
    public Dog(String name) {
        super(name);
    }

    public void makeNoise(){
        System.out.println("I can be annoying but fun");
    }

    public void eat(){
        System.out.println("I eat everything but butt");
    }

    @Override
    public String toString() {
        return "Animal name= " + getName();
    }

    @Override
    public void greet() {

    }
}
