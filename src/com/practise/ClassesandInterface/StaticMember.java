package com.practise.ClassesandInterface;

public class StaticMember {
    private int passneger;
     static int totalPassenger; // static same for all instance
    private static int seats=3;
    // static initilazer
//    static
//    {
//
//    }
    public void addPassenger()
    {
       passneger++;
       totalPassenger++;
    }
    public static  int gets()
    {
        return seats;
    }
}
