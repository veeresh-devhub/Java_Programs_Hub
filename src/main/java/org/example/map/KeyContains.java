package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class KeyContains
{
    public static Map<Integer,String> mapKeyvalue(Map<Integer,String > map)
    {
        if(map.containsKey(4))
        {
            System.out.println("Exits");
            System.out.println(map.get(4));
        }
        else
        {
            System.out.println("Not Exits");
        }
        return map;
    }

    public static void main(String[] args)
    {
        Map<Integer,String > map = new HashMap<>(Map.of(1,"veeru",2,"veera",3,"Dad",4,"Nihira"));
        Map<Integer,String > res = mapKeyvalue(map);
        System.out.println(res);
    }
}
