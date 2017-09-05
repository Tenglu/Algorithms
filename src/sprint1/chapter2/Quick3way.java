package sprint1.chapter2;

public class Quick3way {
	public static void sort(Comparable[] a, int lo,int hi){
		if(lo>=hi) return;
		Comparable v=a[lo];
		int lt=lo,gt=hi,i=lo+1;
		while(i<=gt){
			int cmp=a[i].compareTo(v);
			if(cmp<0) exac(a,i++,lt++);
			else if(cmp>0) exac(a,i,gt--);
			else {
				i++;
			}
		}
		sort(a,lo,lt-1);
		sort(a,gt+1,hi);
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
