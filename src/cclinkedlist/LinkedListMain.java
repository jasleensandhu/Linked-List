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
public class LinkedListMain {
        public static void main (String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.head = new LinkedList.Node<>(5);
        LinkedList.Node<Integer> second = new LinkedList.Node<>(3);
        LinkedList.Node<Integer> third = new LinkedList.Node<>(8);
        LinkedList.Node<Integer> fourth = new LinkedList.Node<>(2);
        LinkedList.Node<Integer> fifth = new LinkedList.Node<>(7);
        LinkedList.Node<Integer> sixth = new LinkedList.Node<>(9);
        LinkedList.Node<Integer> seventh = new LinkedList.Node<>(1);
        LinkedList.Node<Integer> eighth = new LinkedList.Node<>(4);
        LinkedList.Node<Integer> first = new LinkedList.Node<>(6);  
        ll.head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        seventh.setNext(eighth);
        ll.traversal();
        ll.deleteFirstNode();        
        ll.insertAtBeginning(first);
        ll.deleteLastNode();
    }  
    
}
