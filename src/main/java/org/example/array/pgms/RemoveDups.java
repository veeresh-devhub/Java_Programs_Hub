package org.example.array.pgms;

public class RemoveDups
{
    public static void remdups(int [] arr)
    {
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i]!=arr[j])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,2,3,4,2,1,5,7,68,9,7,5,0};
        remdups(arr);
    }
}
