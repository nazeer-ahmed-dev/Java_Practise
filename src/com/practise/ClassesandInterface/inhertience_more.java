package com.practise.ClassesandInterface;

public class inhertience_more {

    public boolean equlas(Object o)
    {
        if(super.equals(o))
            return  true;
        if(!(o instanceof inhertience_more))
            return false;
        inhertience_more inh = (inhertience_more) o;
        return true;
    }

}
