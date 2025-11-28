package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveElements
{
    public static int remove(List<Integer> lst)
    {
        return lst.remove(1);
    }

    public static void main(String[] args)
    {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        System.out.println(lst);
        remove(lst);
        System.out.println(lst);
    }
}
