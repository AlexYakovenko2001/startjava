package com.startjava.lesson_2_3.gues;

public class Player {
    private String name;

    public Player(String playerName) {
        name = playerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}