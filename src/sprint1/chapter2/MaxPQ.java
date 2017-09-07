package sprint1.chapter2;

public class MaxPQ <Key extends Comparable<Key>>{
	private Key[] pq;
	private int N=0;
	
	public MaxPQ(int Max){
		pq=(Key[])new Comparable[Max+1];
	}
	public boolean empty(){
		return N==0;
	}
	public int size(){
		return N;
	}
	public void insert(Key v){
		pq[++N]=v;
		swim(N);
	}
	
	private void swim(int k){
		
		if(k<=N){
			int i=k/2;
			while(i>1&&less(i,k)){
				exac(i,k);
				k=i;
			}
		}
	}
	
	public Key delMax(){
		Key max=pq[1];
		exac(1,N--);
		pq[N+1]=null;
		sink(1);
		return max;
	}
	
	private void sink(int k){
		
		int i=k*2;
		while(k<=N){
			if(i<N&&less(i,i+1)) i=i+1;
			if(less(k,i)){ 
				exac(k,i);
				k=i;
			}else{
				break;
			}
		}
	}
	private void exac(int i,int j){
		Key a=pq[i];
		pq[i]=pq[j];
		pq[j]=a;
	}
	private boolean less(int i,int j){
		
		return pq[i].compareTo(pq[j])<0;
	}
	

}
