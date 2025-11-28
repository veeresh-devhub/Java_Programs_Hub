package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ElementExits
{
    public static int exits(List<Integer> lst)
    {
        int sv = 200;
        if(lst.contains(sv))
        {
            System.out.println("Exits");
            return 0;
        }
        else
        {
            System.out.println("Not Exits");
            return 1;
        }
    }
    public static void main(String[] args)
    {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        System.out.println(exits(lst));

    }
}
