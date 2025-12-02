package org.example.string.pgms;

public class Duplicates
{
    public static String duplicates(String str)
    {
        String dup = "";
        str = str.toLowerCase();
        for(int i = 0; i<str.length(); i++)
        {
            int count = 0;
            for(int j = 0; j<str.length(); j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                count++;
                }
            }
            if(count >1 && i==str.indexOf(str.charAt(i)))
           dup = dup+ str.charAt(i);
        }
        return dup;
    }

    public static void main(String[] args)
    {
        String res = duplicates("JavaProgramming");
        System.out.println(res);

    }
}
