package org.example;

public class Palindrome
{
    public static String PalindromeCheck(String str)
    {
        String rev = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            rev = rev+str.charAt(i);
        }
        if(rev.equals(str))
        {
            return "Its Palindrome";
        }
        else
        {
            return "Its not a Palindrome";
        }
    }


    public static void main(String[] args)
    {
        String result = PalindromeCheck("madam");
        System.out.println(result);

    }
}
