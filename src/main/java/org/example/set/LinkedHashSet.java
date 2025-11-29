package org.example.set;

import java.util.Set;

public class LinkedHashSet
{
    public static void linkedSet(Set<Integer> st)
    {
        System.out.println(st);
    }

    public static void main(String[] args)
    {
        Set<Integer> st1 = new java.util.LinkedHashSet<>();
        st1.add(10);
        st1.add(30);
        st1.add(160);
        st1.add(140);
        linkedSet(st1);
    }
}
