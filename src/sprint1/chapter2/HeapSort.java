package sprint1.chapter2;

public class HeapSort {
	
	public static void sort(Comparable[] a){
		int N=a.length;
		for(int i=N/2;i>=1;i--){
			sink(a,i);
		}
		for(int i=N-1;i>=1;i--){
			exac(a,i,1);
			sink(a,1);
		}	
	}
	public static void sink(Comparable[] a,int i){
		int N=a.length-1;
		while(i*2<=N){
			int j=i*2;
			if(j<N&&less(a,j,j+1)) j++;
			if(less(a,i,j)){
				exac(a,i,j);
				i=j;
			}
		}
	}
	
	public static void exac(Comparable[] a,int i,int j){
		Comparable c=a[i];
		a[i]=a[j];
		a[j]=c;
	}
	public static boolean less(Comparable[] a, int i,int j){
		return a[i].compareTo(a[j])<0;
	}
	
	public static void show(Comparable[] a){
		System.out.println("========Heap Sort=========");
		for(int i=1;i<a.length;i++){

			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
