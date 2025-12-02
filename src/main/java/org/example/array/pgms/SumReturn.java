package org.example.array.pgms;

public class SumReturn
{
    public static int numsReturn(int []arr)
    {

        int sum = 0;
        for(int i =0; i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int [] arr = {5,5,5};
        int res = numsReturn(arr);
        System.out.println("sum : "+res);


    }
}
