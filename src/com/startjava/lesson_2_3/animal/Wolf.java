package com.startjava.lesson_2_3.animal;

public class Wolf {
    private String sex;
    private String name;
    private String color;
    private float weight;
    private int age;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex == "male" || sex == "female") {
            this.sex = sex;
        } else {
            System.out.println("Incorrect sex!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != "") {
            this.name = name;
        } else {
            System.out.println("Incorrect name!");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
         if (color != "") {
            this.color = color;
        } else {
            System.out.println("Incorrect color!");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Incorrect weight!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public void go() {
        System.out.println(name + " идёт");
    }

    public void sit() {
        System.out.println(name + " сидит");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void howl() {
        System.out.println(name + " воет");
    }

    public void hunt() {
        System.out.println(name + " охотится");
    }
}