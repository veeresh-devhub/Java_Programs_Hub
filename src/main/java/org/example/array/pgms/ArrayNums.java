package org.example.array.pgms;

import java.util.Arrays;

public class ArrayNums
{
    public static void numbers()
    {
        int [] arr = {1,2,3,5,43,76};
        for(int i=0;i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        numbers();
    }
}
