import java.util.*;
import java.math.*;
import java.io.*;
import java.util.concurrent.*;
import java.security.*;
import java.text.*;
import java.util.regex.*;

public class ReverseLinkedList
{
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
	
	{
		data = d;
		next = null;
	}
	}
	
	Node reverseUtil(Node curr,Node prev)
	{
		if (head == null)
			return head;
		if (curr.next == null){
			head = curr;
		curr.next = prev;
		return head;
	}
	
	Node next1 = curr.next;
	curr.next = prev;
	reverseutil(next1,curr);
	return head;
	}
	
	void printList(Node node)
	{
		while(node != null)
		{
			System.out.print(node.data+"");
			node = node.next;
		}
	}
	
	public static void main(String[] args)
	{
		Reverse list = new reverse();
		list.head.next = new Node(1);
		list.head.next.next = new Node(5);
		list.head.next.next.next = new Node(1);
		list.head.next.next.next.next = new Node(2);
		list.head.next.next.next.next.next = new Node(3);
		list.head.next.next.next.next.next.next = new Node(4);
		list.head.next.next.next.next.next.next.next = new Node(5);
		
		
		System.out.println("original linked list");
		list.printList(head);
		Node res = list.reverseUtil(head,null);
		System.out.println("");
		System.out.println("");
		System.out.println("Reversed linked list");
		list.printList(res);
	}
	
	
}