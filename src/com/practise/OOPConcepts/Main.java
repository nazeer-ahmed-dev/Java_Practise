package com.practise.OOPConcepts;
import java.lang.Object;
import java.sql.Wrapper;

public class Main {
    public  static void swap(wrapper obj1 , wrapper obj2)
    {
        ClassesAndObjects obj3 = obj1.obj;
        obj1.obj = obj2.obj;    
        obj2.obj = obj3;
    }
    public static void main(String args[])
    {
        //Assoication
        System.out.println("Association");
        Bank bank1 = new Bank("ABL");
        Employee employee1 = new Employee("Sarim");
        System.out.println(employee1.getEmployeeName()+" is employee of "+bank1.getBanName());
        //Exception
        int a = -2 ;
        UserDefinedException userDefinedException=null;
        if(a<0)
        {
            try
            {
                throw new UserDefinedException(a);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }

        }
        else
        {
            userDefinedException = new UserDefinedException(a);
        }
        //System.out.println("CGPA IS : "+userDefinedException.getCgpa());
        //Dynamic method dispatch
        DynamicDispatch dynamicDispatch1 = new DynamicDispatch();
        DynamicDispatch_B  dynamicDispatch_b = new DynamicDispatch_B();
        DynamicDispatch_C dynamicDispatch_c = new DynamicDispatch_C();

        DynamicDispatch dynamicDispatch2;

        dynamicDispatch2 = dynamicDispatch1;
        dynamicDispatch2.m1();

        dynamicDispatch2 = dynamicDispatch_b;
        dynamicDispatch2.m1();

        dynamicDispatch2 = dynamicDispatch_c;
        dynamicDispatch2.m1();

        //encapsulation
        Encapsulation eObj = new Encapsulation();
        eObj.setName("Nazeer");
        System.out.println(eObj.getName());
        // simple class object
        ClassesAndObjects cObj = new ClassesAndObjects("A","nothing ",22, "black");
        cObj.display();

        // swaping two objects
        ClassesAndObjects cObj1 = new ClassesAndObjects("B","nothing ",12, "black");
        ClassesAndObjects cObj2 = new ClassesAndObjects("C","nothing ",22, "red");
        wrapper wObj1 = new wrapper(cObj1);
        wrapper wObj2 = new wrapper(cObj2);
        swap(wObj1,wObj2);
        System.out.println(wObj1.obj.display());

        // working with inheritance
        InheritnaceBicycle mObj = new MountianBike(2,3,4);
        mObj.display();

        // working with interfaces
        System.out.println("Working with interfaces ");
        MultipleInheritence mIObj = new MultipleInheritence();
        mIObj.print_one();
        mIObj.print_two();
        mIObj.print_three();

        //Different ways of creating object
        // 1-using new keyword
        // 2-using new instances
//            try
//        {
//            Class cls = Class.forName("com.practise.OOPConcepts.ClassesAndObjects");
//            ClassesAndObjects obj = (ClassesAndObjects) cls.newInstance();
//            System.out.println(obj.name);
//        }
//        catch (ClassNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//        catch (InstantiationException e)
//        {
//            e.printStackTrace();
//        }
//        catch (IllegalAccessException e)
//        {
//            e.printStackTrace();
//        }


        AcessModifiers accessmodifier = new AcessModifiers();
        accessmodifier.display();
    }
}
