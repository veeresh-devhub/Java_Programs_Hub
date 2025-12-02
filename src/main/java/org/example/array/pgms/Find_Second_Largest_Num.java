package org.example.array.pgms;

public class Find_Second_Largest_Num
{
    public static int[] second_Large(int [] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length; j++)
            {
                if(arr[j]>arr[i])
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
        int[] arr = {1,33,54,23,2,66,78,90};
        int[] res = second_Large(arr);
        System.out.println(res[1]);
    }
}
