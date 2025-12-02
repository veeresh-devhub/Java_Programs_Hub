package org.example.AllMixedPrograms;

import java.util.ArrayList;
import java.util.List;

public class Student
{
        int id;
        String name;

        public Student(int id, String name)
        {
            this.id = id;
            this.name = name;

        }


    public static void main(String[] args)
    {
        List<Student> lst = new ArrayList<>();

        lst.add(new Student(1,"Veeresh"));
        lst.add(new Student(2,"Veera"));
        lst.add(new Student(3,"Nihira"));
        lst.add(new Student(4,"Nihanth Ram"));

        for(Student st:lst)
        {
            System.out.println(st.id+"---->"+st.name);
        }


    }
}
