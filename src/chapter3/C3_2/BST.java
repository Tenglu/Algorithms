package chapter3.C3_2;

public interface BST<Key,Value> {
	
	Value get(Key key);
	
	void delete(Key key);

	void put(Key key, Value value);
	
	boolean contains(Key key);
	
	boolean isEmpty();
	
	int size();
	
	Key min();
	
	Key max();
	
	Key floor(Key key);
	
	Key ceiling(Key key);
	
	int rank(Key key);
	
	Key select(int k);
	
	void deleteMin();
	
	void deleteMax();
	
	int size(Key lo,Key hi);
	
	Iterable<Key> keys(Key lo,Key hi);
	
	Iterable<Key> keys();

}
