package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMaxNum
{
    public static int getMax(List<Integer> lst)
    {
        int max = lst.get(0);
        System.out.println(lst);
        System.out.println(max);
        for(int i=0;i<lst.size(); i++)
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
        List<Integer> lst = Arrays.asList(10,20,30,40,50,60);
        int res = getMax(lst);
        System.out.println(res);
    }
}
