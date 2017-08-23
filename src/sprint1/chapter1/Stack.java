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
		System.out.println();
	}
	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	private class ListIterator implements Iterator<Item>{
		private Node current=first;
		@Override
		public boolean hasNext() {
			return current!=null;
		}

		@Override
		public Item next() {
			Item i=current.item;
			current=current.next;
			return i;
		}
		
	}
	

}

	


	
