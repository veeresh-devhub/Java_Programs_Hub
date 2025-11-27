package org.example.string.pgms;

public class findVowels_Consonants
{
    public static String findVC(String str)
    {
        String vowels = "";
        String consonants = "";

        str = str.toLowerCase();

        for(int i = 0;i <str.length(); i++)
        {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
            {
                 vowels = vowels + str.charAt(i);
            }
            else
            {
                 consonants = consonants+str.charAt(i);
            }
        }
        return "Vowels: " + vowels + "\nConsonants: " + consonants;
    }

    public static void main(String[] args)
    {
        String str = "JavaProgramming";
        String res = findVC(str);
        System.out.println(res);

    }
}
