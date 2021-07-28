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

}

