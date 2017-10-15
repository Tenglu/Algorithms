package sprint1.chapter3;

public interface ST<Key extends Comparable<Key>,Value> {
	public void put(Key key,Value value);

	public Value get(Key key);
	
	public void delete(Key key);
}
