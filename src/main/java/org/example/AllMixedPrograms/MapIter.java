package org.example.AllMixedPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapIter
{
    public static void mapIteration(Map<Integer,String> mp)
    {
        for(Map.Entry<Integer,String> e : mp.entrySet())
        {
            System.out.println(e.getKey() + e.getValue());
        }
    }

    public static Map<Integer,String> getValue(Map<Integer,String> mp)
    {
        for(String i: mp.values())
        {
            System.out.println(i);
        }
        return mp;
    }

    public static void main(String[] args)
    {
        Map<Integer,String> mp = new HashMap<>(Map.of(1,"a",2,"b",3,"c",4,"d"));
        mapIteration(mp);
        //Map<Integer,String> res = getValue(mp);
        System.out.println("Pushing into dummy");
    }
}
