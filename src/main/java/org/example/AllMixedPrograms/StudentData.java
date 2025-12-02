package org.example.AllMixedPrograms;

import java.util.ArrayList;
import java.util.List;

public class StudentData
{
    int id;
    String name;

    public StudentData(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id + " ---> " + name;
    }

    public static List<StudentData> getStudentData()
    {
        List<StudentData> lst = new ArrayList<>();
        lst.add(new StudentData(1,"Veeru"));
        lst.add(new StudentData(2,"Veera"));
        lst.add(new StudentData(3,"Nihira"));
        lst.add(new StudentData(4,"Nihanth Ram"));

        for(StudentData std:lst)
        {
            System.out.println(std.id+"--->"+std.name);
        }
        return lst;
    }

    public static void main(String[] args)
    {
        List<StudentData> res = getStudentData();
        System.out.println(res.get(3));
        System.out.println(res);
    }
}
