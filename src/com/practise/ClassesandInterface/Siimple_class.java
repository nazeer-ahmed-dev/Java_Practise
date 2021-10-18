package com.practise.ClassesandInterface;
import static com.practise.ClassesandInterface.StaticMember.totalPassenger;
import  com.practise.ClassesandInterface.Inheritence.*;
import java.lang.reflect.Array;

public class Siimple_class {

    public static void main(String args[])
    {

        inhertience_more Iobj = new inhertience_more();
        inhertience_more Iobj1 = Iobj;
        if(Iobj.equlas(Iobj1));
            System.out.println("done");
    ///inheritence
        Inheritence obb = new children();
        obb.add();
        obb.dis();
        obb.play();

        Flight flight1 = new Flight();
        flight1.AddPassenger();
        flight1.DisplayPassenger();
        System.out.println(flight1.hasRoom(flight1));
        System.out.println(flight1.CheckValue());

        //array
//        Flight[]  Arrays = new Flight[3];
//        Arrays[0] = new Flight();
//
//        Arrays[0].AddPassenger();
//        Arrays[0].DisplayPassenger();

        // costructor chainig
        Const_Chaining obj = new Const_Chaining(2,3);
        obj.display();

        // working with static members
        StaticMember s_obj = new StaticMember();
        StaticMember s_obj1 = new StaticMember();
        s_obj.addPassenger();
        s_obj1.addPassenger();

       // System.out.println(StaticMember.totalPassenger);
        System.out.println(totalPassenger); // by import static
        // getting static value from static method
        System.out.println(StaticMember.gets());

        //working with Methods
        Methods obj1 = new Methods(10);
        Methods obj2 = new Methods(20);


        swapFlight(obj1,obj2); // passed by reference
        swapNumbers(obj1,obj2); // passed by reference to swap the value

        //overloading
        obj1.addPassenger1(3);


        // Inheritence
        //parents Iobj = new children("Nazeer",21);
        //Iobj.countChildren();


    }
    static void swapNumbers(Methods i , Methods j)
    {
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
    }
    static  void swapFlight(Methods i , Methods j) // every thing local only in this method
    {
        Methods k = i;
        i = j;
        j = k;
    }


    //working with Intheritence



}

