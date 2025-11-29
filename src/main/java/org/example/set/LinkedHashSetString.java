package org.example.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetString
{
    public static Set<String> linkedString(Set<String> st)
    {
        return st;
    }
    public static void main(String[] args)
    {
        Set<String> st1 = new LinkedHashSet<>(Arrays.asList("Veeru","babu","babu","Veera","Babu"));
        Set<String> res = linkedString(st1);
        System.out.println(res);
    }
}
