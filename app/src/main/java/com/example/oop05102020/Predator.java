package com.example.oop05102020;

public class Predator extends Animal{
    private String food;

    public Predator(String name, Integer weight, String food) {
        super(name,weight);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Predator{" +
                "name='" + super.getName() + '\'' +
                ", weight=" + super.getWeight() + '\'' +
                " , food='" + food + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return super.getName() + " , predator";
    }
}
