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
import java.util.*;

public class CCLinkedList {


    int data;
    CCLinkedList next;

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        CCLinkedList a = new CCLinkedList();
        CCLinkedList b = new CCLinkedList();
        CCLinkedList c = new CCLinkedList();

        System.out.println("Enter the value for node a : ");
        a.data = scan.nextInt();
        System.out.println("Enter the value for node b : ");
        b.data = scan.nextInt();
        System.out.println("Enter the value for node c : ");
        c.data = scan.nextInt();

        a.next = b;
        b.next = c;

        System.out.println("value of node a is : " + a.data);
        System.out.println("value of node b is : " + a.next.data);
        System.out.println("value of node c is : " + a.next.next.data);
        
    }

}
