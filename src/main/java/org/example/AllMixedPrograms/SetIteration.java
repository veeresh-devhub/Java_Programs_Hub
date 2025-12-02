package org.example.AllMixedPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetIteration
{
    public static Set<Integer> setIter(Set<Integer> st)
    {
        for(Integer s: st)
        {
            System.out.println(s);
        }
        return st;
    }
    public int getValue(Set<Integer> st)
    {
        for(Integer s: st)
        {
            if(s==4)
            {
                return s;
            }
        }
        System.out.println("Not Found");
        return -1;
    }

    public static int maxvalue(Set<Integer> st)
    {
        int max = 0;
        for(Integer i:st)
        {
            if(i>max)
            {
                max = i;
            }
        }
        return max;
    }


    public static void main(String[] args)
    {
        Set<Integer> st = new HashSet<>(Arrays.asList(1,2,3,3,444,4,5,2,44));

        Set<Integer> res = setIter(st);
        System.out.println(res);

        SetIteration si = new SetIteration();
        int res1 = si.getValue(st);
        System.out.println(res1);

        int res2 = maxvalue(st);
        System.out.println("Max : "+res2);
    }
}
