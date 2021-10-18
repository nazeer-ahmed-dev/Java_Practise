package com.practise.OOPConcepts;

public class UserDefinedException extends Exception{
    int cgpa;
    UserDefinedException(int cgpa)
    {
        this.cgpa = cgpa;
    }
    void setCgpa(int cgpa)
    {
        this.cgpa = cgpa;
    }
    int getCgpa()
    {
        return cgpa;
    }
    public String toString()
    {
        return "CGPA can not be Negative";
    }

}
