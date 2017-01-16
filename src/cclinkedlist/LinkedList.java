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
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }

    
}
