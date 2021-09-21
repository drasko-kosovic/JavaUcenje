package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<Integer> mojIntNiz=new List<Integer>()
           {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
//    int[] mojIntNiz= new int[10];
       for (int i=1; i<9; i++)
        System.out.println("to je "+ mojIntNiz.get(i));
    }
}
