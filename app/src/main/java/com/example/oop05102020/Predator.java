package com.example.oop05102020;


public class Predator extends Animal{
    String food;

    public Predator(String name, Integer weight, String food) {
        super(name,weight);
        this.food = food;
    }
}
