package com.practise.OOPConcepts;

public class ClassesAndObjects {
    String name ;
    String breed;
    int age;
    String color;

    ClassesAndObjects(String name , String breed, int age , String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    public String display()
    {
        return  "Name is "+name+",  breed is "+breed;
    }

}
