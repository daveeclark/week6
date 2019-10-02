package com.week6;

public abstract class Canine extends Animal {

    public Canine(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void roam() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void speak() {

    }

    @Override
    public String toString() {
        return "Animal name= " + getName();
    }
}
