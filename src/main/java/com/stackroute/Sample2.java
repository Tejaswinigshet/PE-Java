package com.stackroute;

public class Sample2
{
    String name="tejaswini";
    public String stringDemo()
    {
        String name1=name.toUpperCase();
        return name1;

    }

    public boolean checkNull()
    {
        if(name.equals(" "))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}


