package org.example.array.pgms;

import java.util.Arrays;

public class SortArray
{
    public static int[] sort(int[] arr)
    {
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int [] arr = {3,4,6,2,5,8,9,1,34,56,78,43};
        int[] res = sort(arr);
        System.out.println(Arrays.toString(res));
    }
}
