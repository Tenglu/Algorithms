package sprint1.chapter5.C5_1;

public class LSD {
	public static void main(String[] args){
		String[] a={"321","abc","123","zzz","kkk"};
		sort(a,3);
		for(String s:a){
			System.out.println(s);
		}
	}

	public static void sort(String a[],int W){
		int N=a.length;
		int R=256;
		String[] aux=new String[N];
		for(int d=W-1;d>=0;d--){
			int count[]=new int[R+1];
			for(int i=0;i<N;i++){
				count[a[i].charAt(d)+1]++;
			}
			for(int i=0;i<R;i++){
				count[i+1]+=count[i];
			}
			for(int i=0;i<N;i++){
				aux[count[a[i].charAt(d)]++]=a[i];
			}
			for(int i=0;i<N;i++){
				a[i]=aux[i];
			}
			
		}
	}
}
