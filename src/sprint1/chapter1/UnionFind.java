package sprint1.chapter1;

public class UnionFind implements UF{

	private int[] id;
	private int count;
	public UnionFind(int N){
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++){
			id[i]=i;
		}
	}
	@Override
	public void union(int p, int q) {
		int pid=id[p];
		int qid=id[q];
		if(pid==qid){
			return;
		}
		for(int i=0;i<id.length;i++){
			if(id[i]==pid){
				id[i]=qid;
			}
			
		}
		count--;
		
	}

	@Override
	public int find(int p) {
		return id[p];
	}

	@Override
	public boolean connected(int p, int q) {
		return find(p)==find(q);
	}

	@Override
	public int count() {
		return count;
	}
	
	public void printAll(){
		for(int i:id){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		UnionFind qf=new UnionFind(8);
		qf.union(1, 3);
		qf.union(3, 5);
		
		System.out.println(qf.count());
		qf.printAll();
	}

}
