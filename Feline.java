package com.week6;

public abstract class Feline extends Animal {

    public Feline(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("I run fast");
    }

    @Override
    public void roam() {
        System.out.println("I walk around");
    }

    @Override
    public void eat(){}

    @Override
    public void sleep(){}

    @Override
    public void speak(){}

    @Override
    public String toString() {
        return "Animal name= " + getName();
    }
}
