package com.week6;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Cheetah("I am a cheetah");
        Animal animal1 = new Bear("I am a bear");
        Animal animal2 = new Tiger("I have stripes and shit");
        Animal animal3 = new Cat("I am lazy and lay around all day");
        Animal animal4 = new Hippo("Hungry hungry hippo hoe. That's alliteration");
        Animal animal5 = new Wolf("I be by my lonely and shit");
        Animal animal6 = new Dog("I can be annoying but fun");

        Animal[] animals = new Animal[]{animal, animal1, animal2, animal3,
        animal4, animal5, animal6};



        Pet pet = new Cat("Ima cat");
        Pet pet1 = new Dog("Ima dog");

        Pet[] petsNamesAndStuff = new Pet[] {pet, pet1};

        petNames(petsNamesAndStuff);
    }

    public static void petNames(Pet[] pets){
        for (Pet petJawn : pets){
            System.out.println(petJawn);
        }
    }

//    public static void getAnimalName(Animal[] animals) {
//        for (Animal zoo : animals){
//            System.out.println(zoo);
//        }
//    }
}