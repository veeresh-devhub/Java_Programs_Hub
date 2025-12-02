package org.example.AllMixedPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SearchStudentId
{
    int id;
    String name;

    public SearchStudentId(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " ---> " + name;
    }

    public static SearchStudentId stdId(int searchId)
    {
        List<SearchStudentId> lst = new ArrayList<>();
        lst.add(new SearchStudentId(1,"V"));
        lst.add(new SearchStudentId(2,"B"));
        lst.add(new SearchStudentId(3,"K"));
        lst.add(new SearchStudentId(4,"G"));
        lst.add(new SearchStudentId(8, "N"));

        for(SearchStudentId std : lst)
        {
            if(std.id==searchId)
            {
                return std;
            }
        }
        return null;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int id = sc.nextInt();
        SearchStudentId res = stdId(2);
        System.out.println(res);
    }
}
