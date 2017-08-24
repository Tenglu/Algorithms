package sprint1.chapter1;

public class WeightedQuickUnionUF implements UF	 {

	private int id[];
	private int sz[];
	private int count;
	public WeightedQuickUnionUF(int N) {
		id=new int[N];
		sz=new int[N];
		for(int i=0;i<N;i++){
			id[i]=i;
			sz[i]=1;
		}
		count=N;
	}
	@Override
	public void union(int p, int q) {
		int i=find(p);
		int j=find(q);
		if(i==j){
			return;
		}
		if(sz[i]<sz[j]){
			id[i]=j;sz[j]+=sz[i];
		}else{
			id[j]=i;sz[i]+=sz[j];
		}
		count--;
		
	}

	@Override
	public int find(int p) {
		while(p!=id[p]){
			p=id[p];
		}
		
		return p;
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
		for(int i=0;i<id.length;i++){
			System.out.println(i+": "+id[i]);
			
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		WeightedQuickUnionUF uf=new WeightedQuickUnionUF(10);
		uf.union(4, 3);
		uf.union(3, 8);
		uf.union(6,5);
		uf.union(9,4);
		uf.union(2, 1);
		uf.union(8, 9);
		uf.union(5, 0);
		uf.union(7, 2);
		uf.union(6, 1);
		uf.union(1, 0);
		uf.union(6, 7);
		uf.printAll();
	}

}
