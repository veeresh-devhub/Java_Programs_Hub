package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class SetCreation
{
    public static Set<Integer> setElements(Set<Integer> st)
    {
        return st;
    }
    public static void main(String[] args)
    {
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);
        Set<Integer> res = setElements(st);
        System.out.println(res);
    }
}
