package com.practise.ClassesandInterface;

public class Const_Chaining {
    private int freeBag;
    private int checksBag;
    private double perBagFee;
    private int c ;

//    Const_Chaining()
//    {
//        c=0;
//    }
    // or
    //initilazation block always run if use constructor then we have chain it
//    {
//        c =0;
//    }
    Const_Chaining(int freeBag)
    {
        this(freeBag>1 ? 25.0d : 50.0d);
        System.out.println("c");
        this.freeBag = freeBag;
    }
    Const_Chaining(int freeBag,int checksBag){

        this(freeBag);
        System.out.println("a");
        this.checksBag = checksBag;
    }
    private Const_Chaining(double perBagFee){ // not accessable in other class
        System.out.println("b");
        this.perBagFee = perBagFee;
    }
    public void display()
    {
        System.out.println(freeBag);
        System.out.println(checksBag);
        System.out.println(perBagFee);
    }

}
