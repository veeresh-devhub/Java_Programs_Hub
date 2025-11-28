package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class UpdateElements
{
    public static int Update(List<Integer> lst)
    {
        System.out.println(lst);
        return lst.set(3,44);
    }
    public static void main(String[] args)
    {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        int res = Update(lst);
        System.out.println(res);
        System.out.println(lst);
    }
}
