package sprint2.chapter1;

import java.util.Iterator;

public class Queue<Item> implements Iterable {
	Node first;
	Node last;
	int N;
	private class Node{
		Node next;
		Item item;
	}
	public void enqueue(Item item){
		Node oldlast=last;
		last=new Node();
		last.item=item;
		last.next=null;
		
		
		if(N==0){
			first=last;
		}else{
			oldlast.next=last;
		}
		N++;
	}
	public Item dequeue(){
		if(first==null){
			return null;
		}
		Node oldfirst=first;
		first=first.next;
		if(first==null){
			last=null;
		}
		N--;
		return oldfirst.item;
	}
	@Override
	public Iterator iterator(){
		return new ListIterator();
	}
	private class ListIterator implements Iterator{
		Node current=first;
		@Override
		public boolean hasNext() {
			
			return current!=null;
		}

		@Override
		public Object next() {
			Node n=current;
			current=current.next;
			return n.item;
		}
		
	}

}
