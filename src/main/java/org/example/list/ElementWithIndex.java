package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ElementWithIndex
{
    public static int getElements(List<Integer>lst)
{
    return lst.get(3);
}
    public static void main(String[] args)
    {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
       int res = getElements(lst);
       System.out.println(res);
    }
}
