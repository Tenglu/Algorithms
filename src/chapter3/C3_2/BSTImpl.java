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
				if(node.key.toString().compareTo(key.toString())<=0){
					node=node.left;
				}
				if(node.key.toString().compareTo(key.toString())>=0){
					node=node.right;
				}
			}
		}
		return null;
	}

	@Override
	public void delete(Key key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void put(Key key, Value value) {
		if (root==null){
			root=new Node(key,value,1);
		}else{
			Node node=root;
			while(node!=null){
				if(node.key.toString().compareTo(key.toString())>0){
					node.N++;
					node=node.left;					
				}else if(node.key.toString().compareTo(key.toString())<0){
					node.N++;
					node=node.right;
				}else{
					break;
				}
				node=new Node(key,value,1);
			}
		}
		
	}

	@Override
	public boolean contains(Key key) {
		Node node=root;
		while(node!=null){
			if(node.key.toString().compareTo(key.toString())==0){
				return true;
			}else{
				if(node.key.toString().compareTo(key.toString())<=0){
					node=node.left;
				}
				if(node.key.toString().compareTo(key.toString())>=0){
					node=node.right;
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
		// TODO Auto-generated method stub
		return null;
	}

}
