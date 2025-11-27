package org.example.string.pgms;

public class VowelsConsonents
{
    public static int[] countVowels_Consonents(String str)
    {
        int vowels = 0;
        int consonents = 0;

        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' & ch<='z')
            {
                if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    vowels++;
                }
                else
                {
                    consonents++;
                }
            }
        }
        return new int[] {vowels,consonents};

    }
    public static void main(String[] args)
    {
        int[] res = countVowels_Consonents("JavaProgramming");
        System.out.println("Vowels = " + res[0]);
        System.out.println("Consonants = " + res[1]);

    }
}
