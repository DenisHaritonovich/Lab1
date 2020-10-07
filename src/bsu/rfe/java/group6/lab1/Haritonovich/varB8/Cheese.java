package bsu.rfe.java.group6.lab1.Haritonovich.varB8;

import java.net.SocketOption;

public class Cheese extends Food implements Nutritious {

    public Cheese() {
        super("Сыр");

    }
    public void consume() {
        System.out.println(this.name + " съеден"+" каллорий "+calculateCalories());
    }

    @Override
    public int calculateCalories() {
        return 50;
    }


}

