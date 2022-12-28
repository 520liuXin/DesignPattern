package com.example.strategy.test;



import java.util.*;

/**
 * 求交集 2
 */
public class ListIntersection2 {

    public static void main(String[] args) {

        List<String>  listA = new ArrayList<String>();
        for (int i= 1; i<=700000; i++)
            listA.add(String.valueOf(i));
        System.out.println("listA 集合长度 ： " + listA.size());

        List<String>  listB = new ArrayList<String>();
        for (int i= 10000; i<=800000; i++)
            listB.add(String.valueOf(i));
        System.out.println("listB 集合长度 ： " + listB.size());
        long startTime1 =  System.currentTimeMillis();
        // 求交集
        List<String> result = receiveCollectionList(listB,listA);
        System.out.println("result 集合长度 ： " + result.size());
        long endTime1 =  System.currentTimeMillis();
        long timeDif = (endTime1 - startTime1);
        System.out.println("求交集 耗时 ： " + timeDif + " ms");

    }

    /**
     * 获取两个ArrayList的交集
     * @param firstArrayList 第一个 ArrayList 集合
     * @param secondArrayList 第二个 ArrayList 集合
     * @return
     */
    public static List<String> receiveCollectionList(List<String> firstArrayList,
                                                     List<String> secondArrayList) {
        if (firstArrayList == null || firstArrayList.size() == 0
                || secondArrayList == null || secondArrayList.size() == 0)
            return  null;
        /** 大集合用 LinkedList **/
        LinkedList<String> result = new LinkedList<String>(firstArrayList);
        /** 小集合用 HashSet **/
        HashSet<String> othHash = new HashSet<String>(secondArrayList);
        /** 采用Iterator迭代器进行数据的操作 **/
        Iterator<String> iter = result.iterator();
        while(iter.hasNext()) {
            if(!othHash.contains(iter.next()))  iter.remove();
        }
        return new ArrayList<String>(result);
    }

}


