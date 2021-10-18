package com.practise.OOPConcepts;
interface one
{
    public void print_one();
}
interface two
{
    public void print_two();

}
interface three extends one ,two
{
    public void print_three();
    public void print_two();
}
 class MultipleInheritence implements three {

    public void print_one()
    {
        System.out.println("1");
    }
    public void print_three()
    {
        System.out.println("2");
    }
    @Override
    public void print_two()
    {
        System.out.println("3");
    }

}
