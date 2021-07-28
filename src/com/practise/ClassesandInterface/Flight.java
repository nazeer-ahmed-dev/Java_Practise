package com.practise.ClassesandInterface;

    class Flight {

    private int passengers;
    private int seats ;

    Flight() {
        passengers = 0;
        seats = 50;
    }
     void AddPassenger()
    {
        if(seats > passengers)
        {
            passengers++;
            seats--;
        }
    }
    void DisplayPassenger()
    {
        System.out.println("Total Psengers : "+passengers);
        System.out.println("Total seats reaming : "+seats);
    }

}

