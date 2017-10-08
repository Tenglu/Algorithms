package sprint2.chapter1;

import java.util.Iterator;

public class Stack<Item> implements Iterable{
	Node first;
	int N;
	private class Node{
		Node next;
		Item item;
	}
	
	public void push(Item item){
		Node oldfirst=first;
		first=new Node();
		first.item=item;
		first.next=oldfirst;
		N++;
	}

	public Item pop(){
		if(N==0){
			return null;
		}
		Node n=first;
		first=first.next;
		N--;
		
		return n.item;
	}
	
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
			Node c=current;
			current=current.next;
			return c.item;
		}
		
	}
}
