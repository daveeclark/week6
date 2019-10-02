package com.week6;

public class Cat extends Feline implements Pet {


    public Cat(String name) {
        super(name);
    }

    public void makeNoise(){
        System.out.println("I am crazy");
    }

    public void roam(){
        System.out.println("I lay around");
    }


    @Override
    public void greet() {}

    @Override
    public String toString() {
        return "Animal name= " + getName();
    }
}
