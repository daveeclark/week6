package com.week6;

public class Cheetah extends Feline {

    public Cheetah(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cheetah says " + getName();
    }

    public void makeNoise(){
        System.out.println("I run fast as hell");
    }

    public void roam(){
        System.out.println("I roam around");
    }
}
