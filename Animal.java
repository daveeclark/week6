package com.week6;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(int legs) {
        this.name = name;
    }

    public abstract void makeNoise();

    public abstract void roam();

    public abstract void eat();

    public abstract void sleep();

    public abstract void speak();

    @Override
    public String toString() {
        return "Animal name= " + name;
    }
}
