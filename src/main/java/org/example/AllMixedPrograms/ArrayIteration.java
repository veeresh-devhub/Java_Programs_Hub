package org.example.AllMixedPrograms;

import java.util.Arrays;

public class ArrayIteration
{
    public static int[] arrayIter(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
           int nums = arr[i];
           //System.out.println(nums);
        }
        return arr;
    }
    public static int[] sort(int[] arr)
    {

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    //System.out.println(arr[i]);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,8 ,2,3,4,18,33,28,94,4,5,6,7,8};

        int[] res = arrayIter(arr1);
        System.out.println(Arrays.toString(res));
        int[] res1 =sort(arr1);
        System.out.println(Arrays.toString(res1));
    }
}
