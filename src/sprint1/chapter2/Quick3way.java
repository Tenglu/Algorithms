package sprint1.chapter2;

public class Quick3way {
	public static void sort(Comparable[] a, int lo,int hi){
		if(hi<=lo) return;
		int lt=lo, i=lo+1, gt=hi;
		Comparable v=a[lo];
		
		while(i<=gt){
			
		}
	}

	
	public static void exac(Comparable[] a,int i, int j){
		Comparable temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static boolean less(Comparable a,Comparable b){
		
		return a.compareTo(b)<0;
	}
	public static void show(Comparable[] a){
		System.out.println("========Quick Sort=========");
		for(Comparable i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
