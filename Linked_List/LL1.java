package com.DSA_PRACTICE;

public class LL1 {
    public static void main(String[] args){
        linked_list list=new linked_list();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(13);
        list.insertLast(17);
        list.insert(100,3);
        list.display();
        System.out.println(list.size);
    }
}
