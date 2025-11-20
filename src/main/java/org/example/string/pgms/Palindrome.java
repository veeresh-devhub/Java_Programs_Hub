package org.example.string.pgms;

public class Palindrome
{
    public static String PalindromeCheck(String str)
    {
        String s = "";

        if(str!=null && !str.isBlank()){

            for(int i=str.length()-1; i>=0; i--)
            {
                s = s.concat(String.valueOf(str.charAt(i)));
            }
            System.out.println("s value    :: "+s);
            if(s.equalsIgnoreCase(str))
            {
                return "Its Palindrome";
            }
            else
            {
                return "Its not a Palindrome";
            }
        }

        return null;

    }


    public static void main(String[] args)
    {
        String result = PalindromeCheck("madam");
        System.out.println(result);

    }
}
