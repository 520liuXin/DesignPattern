package com.example.strategy.test;


import java.util.*;

/**
 * 求交集 1
 */
public class ListIntersection1 {

    public static void main(String[] args) {

        List<String>  listA = new ArrayList<String>();
        for (int i= 1; i<=20000; i++)
            listA.add(String.valueOf(i));
        System.out.println("listA 集合长度 ： " + listA.size());

        List<String>  listB = new ArrayList<String>();
        for (int i= 10000; i<=30000; i++)
            listB.add(String.valueOf(i));
        System.out.println("listB 集合长度 ： " + listB.size());
        long startTime1 =  System.currentTimeMillis();
        // 求交集
        listA.retainAll(listB);
        System.out.println("result 集合长度 ： " + listA.size());
        long endTime1 =  System.currentTimeMillis();
        long timeDif = (endTime1 - startTime1);
        System.out.println("求交集 耗时 ： " + timeDif + " ms");

    }



}


