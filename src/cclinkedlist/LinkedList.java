/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cclinkedlist;

/**
 *
 * @author Jasleen
 */
public class LinkedList<T> {

    static class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> nextNode) {
            this.next = nextNode;
        }

        public T getNodeData() {
            return data;
        }

        public void setNodeData(T data) {
            this.data = data;
        }
    }

    Node<T> head;

    public void traversal() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteFirstNode() {
        Node<T> temp = head;
        head = head.next;
        temp.next = null;
        System.out.println("First Node deleted");
        traversal();
    }

    public void insertAtBeginning(Node<T> first) {
        first.setNext(head);
        head = first;
        System.out.println("Element inserted at the beginning");
        traversal();
    }

    public void deleteLastNode() {
        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Last Node deleted");
        traversal();
    }

    public void insertAtTheEnd(Node<T> end) {
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = end;
        end.next=null;
        System.out.println("Node inserted at the end");
        traversal();
    }
    
    
    public void insertAtGivenPosition(Node<T> random, int n){
        Node<T> temp = head;
        int count = 1;
        while(count<n-1){
            count++;
            temp = temp.next;
        }
        random.next = temp.next;
        temp.next = random;
        
        System.out.println("Node entered at specified position");
        traversal();
    }
    
    public void deleteAtGivenPosition(int n){
        int count =1;
        Node<T> temp = head;
        while(count<n-1){
            temp = temp.next;
            count++;
        }
        temp.next  = temp.next.next; 
        System.out.println("Node deleted from the specified position");
        traversal();
    }
    
    public void lengthOfLinkedList(){
        Node<T> temp = head;
        int count = 0;
        while(temp!= null){
            count=count+1;
            temp=temp.next;
        }
        System.out.println("Length of the Linked List is: "+count);
    }
    
}
