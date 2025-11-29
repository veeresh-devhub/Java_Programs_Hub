package org.example.list;

import java.util.Arrays;
import java.util.List;

public class GetMin
{
    public static int getMin(List<Integer> lst)
    {
        int min = lst.get(0);
        for(int i = 0;i<lst.size(); i++)
        {
            if(lst.get(i)<min)
            {
                min = lst.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        List<Integer> lst1 = Arrays.asList(10,20,8,30,40,50,60);
        int res = getMin(lst1);
        System.out.println(res);
    }
}
