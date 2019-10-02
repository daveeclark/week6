package com.week6;

public class Wolf extends Canine {
    public Wolf(String name) {
        super(name);
    }

    public void makeNoise(){
        System.out.println("Lone wolf");
    }

    public void eat(){
        System.out.println("I'll tear you apart");
    }

    @Override
    public String toString() {
        return "Animal name= " + getName();
    }
}
