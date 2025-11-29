package org.example.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ElementCheck
{
    public static Set<Integer> ElementExit(Set<Integer> st)
    {
        if(st.contains(10))
        {
            System.out.println("Exits");
        }
        else
        {
            System.out.println("Not Exits");
        }
        return st;
    }

    public static void main(String[] args)
    {
        Set<Integer> st1 = new HashSet<>(Arrays.asList(10,20,30,40,50,60));
        Set<Integer> res = ElementExit(st1);
        //System.out.println(res);
    }
}
