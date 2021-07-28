package com.practise.ClassesandInterface;

import java.lang.reflect.Array;

public class Siimple_class {

    public static void main(String args[])
    {
        Flight flight1 = new Flight();
        flight1.AddPassenger();
        flight1.DisplayPassenger();
        flight1.AddPassenger();
        flight1.DisplayPassenger();

        Flight[]  Arrays = new Flight[3];
        Arrays[0] = new Flight();

        Arrays[0].AddPassenger();
        Arrays[0].DisplayPassenger();

    }
}

