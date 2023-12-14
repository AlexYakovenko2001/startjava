package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();

        firstWolf.setSex("male");
        firstWolf.setName("wolf_1");
        firstWolf.setColor("white");
        firstWolf.setWeight(35.3f);
        firstWolf.setAge(3);
       
        System.out.println("Wolf sex - " + firstWolf.getSex());
        System.out.println("Wolf name - " + firstWolf.getName());
        System.out.println("Wolf color - " + firstWolf.getColor());
        System.out.println("Wolf weight - " + firstWolf.getWeight());
        System.out.println("Wolf age - " + firstWolf.getAge());

        System.out.println();

        firstWolf.go();
        firstWolf.sit();
        firstWolf.run();
        firstWolf.howl();
        firstWolf.hunt();
    }
}