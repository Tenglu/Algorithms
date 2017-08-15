package chapter3.C3_2;

public class BSTImpl<Key,Value> implements BST<Key,Value>{
	private Node root;
	private class Node{
		private Key key;
		private Value value;
		private Node left;
		private Node right;
		private int N;
		public Node(Key key,Value value, int N){
			this.key=key;
			this.value=value;
			this.N=N;
		}
		
		
	}
	@Override
	public Value get(Key key) {
		Node node=root;
		while(node!=null){
			if(node.key.toString().compareTo(key.toString())==0){
				return node.value;
			}else{
				
				if(node.key.toString().compareTo(key.toString())<0){
					
					node=node.right;
				}
				else if(node.key.toString().compareTo(key.toString())>0){
					node=node.left;
				}
			}
		}
		
		return null;
	}

	@Override
	public void delete(Key key) {
		
		
	}

	@Override
	public void put(Key key, Value value) {
		root=put(root,key,value);
		
	}
	public Node put(Node node, Key key, Value value){
		
		if(node==null){
			return new Node(key,value,1);
			
		}else{
			if(key.toString().compareTo(node.key.toString())>0){
				node.right=put(node.right,key,value);
			}else if(key.toString().compareTo(node.key.toString())<0){
				node.left=put(node.left,key,value);
			}else{
				node.value=value;
			}
			node.N=size(node.left)+size(node.right)+1;
		}
		
		return node;
		
	}

	@Override
	public boolean contains(Key key) {
		Node node=root;
		while(node!=null){
			if(node.key.toString().compareTo(key.toString())==0){
				return true;
			}else{
				if(node.key.toString().compareTo(key.toString())<0){
					node=node.right;
				}
				else if(node.key.toString().compareTo(key.toString())>0){
					node=node.left;
				}
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		
		return root==null;
	}

	@Override
	public int size() {
		
		return root.N;
	}
	public int size(Node node){
		if(node==null){
			return 0;
		}
		return size(node.left)+1+size(node.right);
	}

	@Override
	public Key min() {
		Node node=root;
		while(node.left!=null){
			node=node.left;
		}
		return node.key;
	}

	@Override
	public Key max() {
		Node node=root;
		while(node.right!=null){
			node=node.right;
		}
		return node.key;
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
		Node node=root;
		
		return null;
	}
	
	public String toString(){
		Node node=root;
		return toString(node);
	}
	
	public String toString(Node node){
		if(node==null){
			return "";
		}
		
		return toString(node.left)+node.key+toString(node.right);
		
	}

}
