package com.practice.Collections;

class Node{
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LL{
        Node head;

    public LL() {
        this.head = null;
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void printList(){
        if (head==null){
            System.out.println("list is empty");
        }
        Node currNode = head;
        while (currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
}

public class LinkedListInsertionOperation {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("Bhargav");
        list.printList();
        list.addLast("programmer");
        list.printList();
    }
}