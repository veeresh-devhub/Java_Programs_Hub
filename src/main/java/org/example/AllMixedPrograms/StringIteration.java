package org.example.AllMixedPrograms;

public class StringIteration
{
    // Program to iterate the string
    public static String StringIter(String str1)
    {
        String value = "";
        for(int i = 0; i<str1.length(); i++)
        {
            value = value + str1.charAt(i);
        }
        return value;
    }
    // Program to print only chars
    public static void onlyChars(String str2)
    {
        str2 = str2.toLowerCase();
        String chars = "";
        for (int i = 0; i < str2.length(); i++)
        {
            char ch = str2.charAt(i);
            if(ch>='a'&& ch<='z')
            {
                chars = chars+ch;
            }
        }
        System.out.println(chars);
    }
    //program to print only nums
    public static String onlyNums(String str)
    {
        String nums = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9')
            {
                nums = nums+ch;
            }
        }
        return nums;
    }

    public static void main(String[] args)
    {
        String str = "Veeresh_Java_P8237659rogramming";
        String res = StringIter(str);
        String on = onlyNums(str);
        System.out.println(on);
        System.out.println(res);
        onlyChars(str);
    }
}
