package sprint2.chapter1;

public class WeightedQuickUnionUF implements UF{

	int id[];
	int sz[];
	int count;
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
		int pid=id[p];
		int qid=id[q];
		if(sz[p]>sz[q]){
			id[q]=id[p];
			sz[p]=sz[p]+sz[q];
			
		}else{
			id[p]=id[q];
			sz[q]=sz[q]+sz[p];
		}
		count--;
		
	}

	@Override
	public int find(int p) {
		while(id[p]!=p){
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
	public void printUF(){
		for(int i=0;i<id.length;i++){
			System.out.print(id[i]+","+sz[i]+" ");
		}
		System.out.println("");
	}

}
