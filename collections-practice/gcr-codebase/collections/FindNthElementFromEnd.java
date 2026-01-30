package com.collections;

class ListNode{
	public char data;
	public ListNode next;
	
	public ListNode(char data) {
		this.data = data;
		this.next = null;
	}
}


public class FindNthElementFromEnd {
	ListNode head;
	public  void addFirst(char data) {
		ListNode node = new ListNode(data);
		if(head == null) {
			head = node;
			return;
		}
		node.next = head;
		head = node;
	}
	public ListNode findNthElementFromEnd(int pos) {
		ListNode ref = head;
		ListNode temp = head;
		int count = 1;
		while(count<=pos) {
			temp = temp.next;
			count++;
		}
		while(temp != null) {
			temp = temp.next;
			ref = ref.next;
		}
		return ref;
	}
	
	public static void main(String[] args) {
		FindNthElementFromEnd l = new FindNthElementFromEnd();
		l.addFirst('F');
		l.addFirst('E');
		l.addFirst('D');
		l.addFirst('C');
		l.addFirst('B');
		l.addFirst('A');
		ListNode NthNode = l.findNthElementFromEnd(3);
		System.out.println(NthNode.data);
	}
}
