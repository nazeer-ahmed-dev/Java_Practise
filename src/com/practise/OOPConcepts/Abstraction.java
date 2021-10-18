package com.practise.OOPConcepts;
abstract class shape
{
    String color;
    abstract double area();
    public abstract String toString();
    shape(String color)
    {
        this.color = color;
    }
    String getColor()
    {
        return this.color;
    }

}
class Circle extends shape
{
    double radius;
    Circle(String color , double radius)
    {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return  Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Area =" + area() +
                '}';
    }
}
public class Abstraction {

}
