package com.week6.calculator;

public abstract class Animal {
    public String name;

    public Animal(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
