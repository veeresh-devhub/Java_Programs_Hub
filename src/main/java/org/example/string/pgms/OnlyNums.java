package org.example.string.pgms;

public class OnlyNums
{
    public String findNums(String str)
{
    String num = "";
    for(int i=0; i<str.length(); i++)
    {
        char ch = str.charAt(i);
        if(ch>='0' && ch<='9')
        {
            num = num+ch;
        }
    }
    return num;
}

    public static void main(String[] args)
    {
        OnlyNums on = new OnlyNums();
        String res = on.findNums("Javll2k54blkb5");
        System.out.println(res);

    }
}
