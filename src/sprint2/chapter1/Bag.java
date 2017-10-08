package sprint2.chapter1;

import java.util.Iterator;

public class Bag<Item> implements Iterable{
	private Node first;
	private int N;
	
	private class Node{
		Node next;
		Item item;
	}
	public void add(Item item){
		Node oldfirst=first;
		first=new Node();
		first.next=oldfirst;
		first.item=item;
	}
	
	
	@Override
	public Iterator iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator{
		Node current = first;
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
