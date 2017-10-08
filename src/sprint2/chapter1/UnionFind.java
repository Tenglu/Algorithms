package sprint2.chapter1;

public class UnionFind implements UF{
	int id[];
	int count;
	public UnionFind(int N){
		id= new int[N];
		for(int i=0;i<N;i++){
			id[i]=i;
		}
		count=id.length;
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
		
		return id[p]==id[q];
	}

	@Override
	public int count() {
		return count;
	}

}
