package org.example.AllMixedPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIter
{
    public static int listIterator(List<Integer> lst)
    {
        for(int i=0; i<lst.size();i++)
        {
            System.out.println(lst.get(i));
        }
        return lst.indexOf(3);
    }
    public int maxElement(List<Integer> lst)
    {
        int max = lst.get(0);
        for(int i=0;i<lst.size();i++)
        {
            if(lst.get(i)>max)
            {
                max = lst.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        List<Integer> lst = Arrays.asList(1,2,3,44,5,6,7,8);
        //int res = listIterator(lst);
        //System.out.println("Index : "+res);

        ListIter li = new ListIter();
        int res1 = li.maxElement(lst);
        System.out.println(lst);
        System.out.println("Max : "+res1);
    }
}
