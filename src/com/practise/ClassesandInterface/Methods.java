package com.practise.ClassesandInterface;

public class Methods {

    private int flightNumber,passenger,totalBag;
    Methods(int flightNumber)
    {
        this.flightNumber=flightNumber;
    }
    int getFlightNumber()
    {
        return flightNumber;
    }
    void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }
    boolean hasSeat()
    {
        return  true;
    }
    void addPassenger1()
    {
        if(hasSeat())
        {
            passenger++;
        }
    }
    void addPassenger1(int bags)
    {
            if(hasSeat())
            {
                addPassenger1();
                totalBag++;
            }
    }


}
