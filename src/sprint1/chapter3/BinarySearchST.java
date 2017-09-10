package sprint1.chapter3;

public class BinarySearchST <Key extends Comparable<Key>,Value>{
	private Key[] keys;
	private Value[] values;
	private int N;
	public BinarySearchST(int capacity){
		keys=(Key[])new Comparable[capacity];
		values=(Value[])new Object[capacity];
	}
	
	public void put(Key key, Value value){
		int r=rank(key);
		//if(get(key)!=null){
		if(r<N&&keys[r].compareTo (key)==0){	
			values[r]=value;
		}else{	
			for(int i=N;i>r;i--){
				keys[i]=keys[i-1];
				values[i]=values[i-1];
			}
			keys[r]=key;
			values[r]=value;
			N++;
		}
		
	}
	public Value get(Key key){
		if(N==0){
			return null;
		}
		int r=rank(key);
		if(keys[r].compareTo(key)!=0){
			return values[r];
		}
		return null;
	}
	public int rank(Key key){
		int lo=0;
		int hi=N-1;
		while(hi>lo){
			int mid=lo+(hi-lo)/2;
			if(keys[mid].compareTo(key)>0){
				hi=mid-1;
			}else if(keys[mid].compareTo(key)<0){
				lo=mid+1;
			}else{
				return mid;
			}
		}
		return lo;
	}
	public void delete(Key key){
		
	}
	public int size(){
	
		return N;
	}
	public void print(){
		System.out.println("=======Binary Search=======");
		for(int i=0;i<N;i++){
			System.out.print("["+keys[i]+"]: "+values[i]+" "+rank(keys[i])+" ");
		}
		System.out.println("");
	}
	
}
