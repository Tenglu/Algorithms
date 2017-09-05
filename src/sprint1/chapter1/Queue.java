package sprint1.chapter1;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>{
	private Node first;
	private Node last;
	private int N;
	
	private class Node{
		Node next;
		Item item;
	}
	public int size(){
		return N;
	}
	public boolean isEmpty(){
		return first==null;
	}
	
	public void enqueue(Item item){
		Node oldlast=last;
		last=new Node();
		last.next=null;
		last.item=item;
		if(isEmpty()){
			first=last;
		}else{
			oldlast.next=last;
		}
		N++;
		
	}
	public Item dequeue(){
		Item item=first.item;
		first=first.next;
		if(isEmpty()){
			last=null;
		}
		N--;
		return item;
	}
	
	
	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	private class ListIterator implements Iterator<Item>{
		Node current=first;
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
