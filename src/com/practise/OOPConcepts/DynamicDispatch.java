package com.practise.OOPConcepts;

public class DynamicDispatch {
    DynamicDispatch()
    {
        System.out.println("Main/Parent Class constructor");
    }
    void m1()
{
    System.out.println("Main class");
}
}
class DynamicDispatch_B extends  DynamicDispatch
{
    DynamicDispatch_B(){

        System.out.println("Child classB constructor");
    }
    void m1()
    {
        System.out.println("Class B");
    }
}
class DynamicDispatch_C extends DynamicDispatch
{
    DynamicDispatch_C()
    {
        System.out.println("Child classC constructor");
    }
    void m1()
    {
        System.out.println("Class C ");
    }
}
