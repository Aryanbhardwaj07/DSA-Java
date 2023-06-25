package com.DSA_PRACTICE;
public class linked_list {
    private Node head;
    private Node tail;
    int size;
    public linked_list(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val,int index) {
        if (index == 0) {
            insertFirst(val);
        }
        if (index == size) {
            insertLast(val);
        return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;


    }
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        System.out.println("Deleted"+val);
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }

        return node;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node{
       private int value;
       private Node next;

       public Node(int value){
           this.value=value;
       }
       public Node(int value,Node next){
           this.value=value;
           this.next=next;
       }
    }
}
