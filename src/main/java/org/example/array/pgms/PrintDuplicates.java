package org.example.array.pgms;

public class PrintDuplicates
{
    public static void dups()
    {
        int [] arr = {1,2,2,3,4,5,5,6,3,7,8};
        for(int i = 0; i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]);
                    break;
                }
            }
        }

    }
    public static void main(String[] args)
    {
        dups();
    }
}
