package chapter3.C3_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;


public class C3_1_3 {
	public static void main(String args[]){
		OrderedSequentialSearchST<String,String> os=new OrderedSequentialSearchST();
		os.put("4", "3");
		os.put("2", "2");
		os.put("1", "3");

		os.delete("4");
		Iterable<String> i=os.keys();
		Iterator it=i.iterator();
		while(it.hasNext()){
			
			System.out.println(it.next());
		}

		
	}
}

class OrderedSequentialSearchST<Key,Value> implements ST<Key,Value>{
	private Node first;
	private class Node{	
		private Key key;
		private Value value;
		private Node next;
		public Node(Key key, Value value, Node next){
			this.next=next;
			this.key=key;
			this.value=value;
		}
	}
	
	@Override
	public void put(Key key,Value value){
		if(first==null){
			first=new Node(key,value,null);
			
		}
		else{
			Node node=first;
			
			if(key.toString().compareTo(first.key.toString())<0){
				Node newNode=new Node(key,value,first);
				first=newNode;
			}else{                          
				while(node.next!=null&&key.toString().compareTo(node.next.key.toString())>0){	
					node=node.next;
				}
				if(node.next==null){
					Node newNode=new Node(key,value,null);
					node.next=newNode;
				}else{
					Node newNode=new Node(key,value,node.next);
					node.next=newNode;
				}
			}
		}
	
	}

	@Override
	public Value get(Key key) {
		for(Node node=first;node!=null;node=node.next){
			if(key.equals(node.key)){
				return node.value;
			}
		}
		return null;
	}

	@Override
	public void delete(Key key) {
		Node node=first;
		if(first.key.equals(key)){
			if(first.next==null){
				first=null;
			}else{
				first=first.next;
			}
		}else{
			for(node=first;node.next!=null;node=node.next){
				if(key.equals(node.next.key)){
					if(node.next.next!=null){
						node.next=node.next.next;
					}
					else{
						node.next=null;
					}
				}
			}
		}
		
	}

	@Override
	public boolean contains(Key key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Key min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Key max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Key floor(Key key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Key ceiling(Key key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int rank(Key key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Key select(int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size(Key lo, Key hi) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterable<Key> keys(Key lo, Key hi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Key> keys() {
		//Queue<Key> q = null;
		List <Key> list=new ArrayList<Key>();
		for(Node node=first;node!=null;node=node.next){
			//q.add(node.key);
			list.add(node.key);
		}
		
		return list;
	}
	
	
}