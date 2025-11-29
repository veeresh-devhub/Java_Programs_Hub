package org.example.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IterateSet
{
    public static Set<Integer> ItereSet(Set<Integer> st)
    {
        for(int i:st)
        {
            System.out.println(i);
        }
        return st;
    }

    public static void main(String[] args)
    {
        Set<Integer> st  = new HashSet<>(Arrays.asList(10,20,20,30,40,50));
       Set<Integer> res = ItereSet(st);
        System.out.println(res);
    }
}
