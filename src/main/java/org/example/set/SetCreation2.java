package org.example.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetCreation2
{
    public static Set<Integer> setCreation(Set<Integer> st)
    {
        return st;
    }

    public static void main(String[] args)
    {
        Set<Integer> st1 = new HashSet<>(Arrays.asList(10,10,20,30,40,50,60,70,80));
        Set<Integer> res = setCreation(st1);
        System.out.println(res);
    }
}
