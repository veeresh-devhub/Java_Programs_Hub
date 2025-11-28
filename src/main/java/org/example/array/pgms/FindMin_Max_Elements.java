package org.example.array.pgms;

public class FindMin_Max_Elements
{
    public static int[] Min_Max(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return new int[]{min,max} ;
    }

    public static void main(String[] args)
    {
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] res = Min_Max(arr1);
        System.out.println("Min : "+res[0]+" & Max : "+res[1]);
        System.out.println();
    }
}
