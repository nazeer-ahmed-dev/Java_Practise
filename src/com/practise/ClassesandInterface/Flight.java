package com.practise.ClassesandInterface;

    class Flight {

    private int passengers;
    private int seats ;
    private int c = 43; //field initializer
    private int b; // to checking the default value

    Flight() {
        passengers = 0;
        seats = 50;
    }


    public Flight(int seats )
    {
        this.seats = seats;
    }

    // consrutors chaining 
    public Flight(int seats , int passengers)
    {
        this(seats); // this.seats = seats
        this. passengers = passengers;

    }

     void AddPassenger()
    {
        if(seats > passengers)
        {
            passengers++;
            seats--;
        }
    }
     boolean hasRoom(Flight f1)
    {
        int total = passengers + f1.passengers;
        return  total<=seats;
    }
    void DisplayPassenger()
    {
        System.out.println("Total Psengers : "+passengers);
        System.out.println("Total seats reaming : "+seats);
    }
    public int getSeats()
    {
        return seats;
    }
    public void setSeats(int seats)
    {
        this.seats = seats;
    }
    //checking the default value of class member;
    public int CheckValue()
    {
        return  b;
    }
}

