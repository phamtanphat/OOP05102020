package com.example.oop05102020;

public class Animal {
    // 1 : Thuộc tính
    String name;
    Integer weight;

    // 2 : Hành vi(Phương thức)
    public void setName(String name){
        if (name.length() <= 0){
            throw new NullPointerException("Chuỗi rỗng");
        }
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
