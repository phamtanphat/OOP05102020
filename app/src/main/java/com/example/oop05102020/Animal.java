package com.example.oop05102020;

public class Animal {
    // 1 : Thuộc tính
    private String name;
    private Integer weight;

    // constructor
    public Animal(String name , Integer weight){
        this.name = name;
        this.weight = weight;
    }

    // 2 : Hành vi(Phương thức)
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
