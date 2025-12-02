package org.example.array.pgms;

public class UniqueElements
{
    public static void unique(int [] arr)
    {
        for(int i=0;i<arr.length; i++)
        {
            int count = 0;
            for(int j=0; j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.print(arr[i]);
            }
        }

    }

    public static void main(String[] args)
    {
        int [] arr = {1,2,3,2,4,5,2,7,41,7,9,2};
        unique(arr);

    }
}
