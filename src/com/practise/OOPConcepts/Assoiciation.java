package com.practise.OOPConcepts;

public class Assoiciation {

}
class Bank
{
    String name;
    Bank(String name )
    {
        this.name = name;
    }
    public String getBanName()
    {
        return name;
    }
}
class Employee
{
    String name;
    Employee(String name )
    {
        this.name = name;
    }
    public String getEmployeeName()
    {
        return name;
    }
}
class Student
{
    String name;
    int id;
    String dept;

    Student(String name , int id , String dept)
    {
        this.name = name;
        this.id = id;
        this.dept =dept;
    }

}