package com.practise.ClassesandInterface;

public class Inheritence {

    private String Fname="Noor Muhammad" ;
    private int Fage=50;
    private int fNoChild=6;
    private int cChild;
    private  int val = 14;
    int getset(){
        return val;
    }
    void countChildren() {
        cChild++;
    }
    void display(String CName)
    {
        System.out.println("Father Name : "+Fname);
        System.out.println("Father Age : "+Fage);
        System.out.println("Child Name : "+CName);
    }
    void add()
    {
        val++;
    }
    void dis()
    {
        System.out.println(val);
    }
    //method overriding
    void play()
    {
        System.out.println(getset());
    }
}

class children extends Inheritence{
    private String CName;
    private int CAge;
    private int val=12;
    children(){

    }
    children(String CName, int CAge)
    {
        this.CName = CName;
        this.CAge = CAge;
        display(CName);
    }
    int getset(){
        return val;
    }

//    void add()
//    {
//        val++;
//    }
//    void dis()
//    {
//        System.out.println(val);
//    }





}
