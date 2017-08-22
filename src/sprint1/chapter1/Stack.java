package sprint1.chapter1;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {

	private int N;
	private Node first;
	
	private class Node{
		Item item;
		Node next;
	}
	public void push(Item item){
		Node oldfirst=first;
		first=new Node();
		first.next=oldfirst;
		first.item=item;
		N++;
	}
	
	public Item pop(){
		Item item=first.item;
		first=first.next;
		N--;
		return item;
	}
	public boolean isEmpty(){
		return first==null;
	}
	public int size(){
		return N;
	}
	public void printString(){
		Node node=first;
		while(node!=null){
			System.out.print(node.item.toString()+" ");
			node=node.next;
		}
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

	


	
