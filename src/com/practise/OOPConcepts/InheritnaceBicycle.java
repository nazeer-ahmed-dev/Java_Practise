package com.practise.OOPConcepts;

public class InheritnaceBicycle {
            int gear;
            int speed;

            InheritnaceBicycle(int gear,int speed)
            {
                this.gear = gear;
                this.speed = speed;
            }
            void applyBreak(int decrement)
            {
                speed = speed - decrement;
            }
            void applySpeed(int increment)
            {
                speed = speed + increment;
            }
            void display()
            {
                System.out.print("Gear No : "+this.gear+" & Speed : "+this.speed);
            }
}
class MountianBike extends  InheritnaceBicycle
{
    int seatHight;
    MountianBike(int gear, int speed, int seatHight) {
        super(gear, speed);
        this.seatHight = seatHight;
    }
    void display()
    {
        super.display();
        System.out.println(" , SeatHeight : "+this.seatHight);
    }
}
