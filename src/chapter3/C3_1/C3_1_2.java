
package chapter3.C3_1;

public class C3_1_2 {
	public static void main(String[] args){
		ArrayST ST=new ArrayST<String,String>();
		ST.put("Name","Tenglu");
		ST.put("Gender", "Male");
		System.out.println(ST.contains("Name"));
	}
}
class ArrayST<Key,Value> implements ST<Key,Value>{
	private Node first;
	private class Node{
		private Key key;
		private Value value;
		Node next;
		public Node(Key key,Value value,Node next){
			this.key=key;
			this.value=value;
			this.next=next;
		}
		
	}
	@Override
	public void put(Key key,Value value){
		for(Node node=first;node!=null;node=node.next){
			if(key.equals(node.key)){
				node.value=value;
				return;
			}
		}
		first=new Node(key, value,first);
	}
	@Override
	public Value get(Key key){
		for(Node node=first;node!=null;node=node.next){
			if(key.equals(key)){
				return node.value;
			}
		}
		return null;
	}
	@Override
	public void delete(Key key) {
		for(Node node=first;node.next!=null;node=node.next){
			if(key.equals(node.next.key)){
				node.next=node.next.next;
			}
		}
		
	}
	@Override
	public boolean contains(Key key) {
		 for(Node node=first;node!=null;node=node.next){
			 if(key.equals(node.key)){
				 return true;
			 }
		 }
		return false;
	}
	@Override
	public boolean isEmpty() {
		
		return first==null;
	}
	@Override
	public int size() {
		int i=0;
		for(Node node=first;node!=null;node=node.next){
			i++;
		}
		return i;
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
//		Iterable<Key> i=new Iterable<Key>();
//		i.
		return null;
	}
	@Override
	public Iterable<Key> keys() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


	
}

