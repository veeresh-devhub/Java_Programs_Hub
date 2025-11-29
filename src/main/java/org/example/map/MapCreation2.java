package org.example.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapCreation2
{
    public static String mapElements(Map<Integer,String> mp)
    {
       return mp.get(4);
    }

    public static void main(String[] args)
    {
        Map<Integer,String > map = new HashMap<>(Map.of(4,"Veeru",1,"Veera",3,"Nihira",8,"Nihanth Ram"));
        String res = mapElements(map);
        System.out.println(res);
    }
}
