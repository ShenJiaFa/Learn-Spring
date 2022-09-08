package com.shenjiafa.dao.impl;

import com.shenjiafa.dao.BookDao;

import java.util.*;

/**
 * Function: 图书持久层实现类
 *
 * @author ShenJiaFa
 * @since 2022/9/7
 */
public class BookDaoImpl implements BookDao {
    private int[] myArray;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String, String> myMap;
    private Properties myProperties;

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProperties(Properties myProperties) {
        this.myProperties = myProperties;
    }

    @Override
    public void save() {
        System.out.println("BookDao save...");
        System.out.println("array:" + Arrays.toString(myArray));
        System.out.println("list:" + myList);
        System.out.println("set:" + mySet);
        System.out.println("map:" + myMap);
        System.out.println("properties:" + myProperties);
    }
}
