package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapCreation
{
    public static void mapValues(Map<String,Integer> mp)
    {
        System.out.println(mp);
    }

    public static void main(String[] args)
    {
        Map<String,Integer> mp1 = new HashMap<>();
        mp1.put("Veeru",44);
        mp1.put("Veera",14);
        mp1.put("Nihanth",84);
        mp1.put("Nihira",94);
        mapValues(mp1);
    }
}
