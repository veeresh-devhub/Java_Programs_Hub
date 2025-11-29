package org.example.set;

import java.util.*;

public class Convert_List_to_Set
{
    public static Set<Integer> list_Set(List<Integer> lst)
    {
        Set<Integer> st = new HashSet<>(lst);
        return st;
    }

    public static void main(String[] args)
    {
        List<Integer> lst = Arrays.asList(10,20,20,30,30,40);
        Set<Integer> res = list_Set(lst);
        System.out.println(res);
    }
}
