package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ListElements
{
    public static void allElements()
    {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);

        System.out.println("List : "+lst);
        System.out.println("Index of Particular Element : "+lst.indexOf(40));
    }
    public static void main(String[] args)
    {
        allElements();
    }
}
