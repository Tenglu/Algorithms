package sprint1.chapter1;

import java.util.Iterator;

public class Bag<Item> implements Iterable {
	private Node first;
	private int N;
	private class Node{
		Node next;
		Item item;
	}

	public void add(Item item){
		Node oldfirst=first;
		first=new Node();
		first.item=item;
		first.next=oldfirst;
		N++;
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
