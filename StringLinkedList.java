package com.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;
        Node curr = first;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = null;
        last.prev = newNode;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
