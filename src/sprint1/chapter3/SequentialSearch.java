package sprint1.chapter3;

public class SequentialSearch <Key,Value>{
	private Node first;
	private class Node{
		public Node next;
		public Key key;
		public Value value;
		
		public Node(Key key, Value value,Node next){
			this.next=next;
			this.key=key;
			this.value=value;
		}
	}
	public void put(Key key,Value value){
		for(Node node=first;node!=null;node=node.next){
			if(key.equals(node.key)){
				node.value=value;
			}
		}
		Node n=new Node(key,value,first);
		first=n;
	}
	public Value get(Key key){
		for(Node node=first;node!=null;node=node.next){
			if(key.equals(node.key)){
				return node.value;
			}
		}
		return null;
	}
	
	public void print(){
		System.out.println("=======Sequential Search=======");
		for(Node node=first;node!=null;node=node.next){
			System.out.print("["+node.key+"]: "+node.value+" ");
		}
		System.out.println();
	}

}
