package sprint2.chapter2;

public class QuickSort {
	public static void QuickSort(Comparable[] a){
		Sort(a,0,a.length-1);
	}
	
	private static void Sort(Comparable[] a,int lo,int hi){
		if(lo>=hi){
			return;
		}
		int j=partition(a,lo,hi);
		Sort(a,lo,j-1);
		Sort(a,j+1,hi);
	}
	private static int partition(Comparable[] a,int lo,int hi){
		int i=lo;
		int j=hi+1;
		Comparable v=a[lo];
		while(true){
			while(less(a[++i],v)) if(i==hi) break;
			while(less(v,a[--j])) if(j==lo) break;
			if(i>=j) break;
			exac(a,i,j);
		}
		exac(a,lo,j);

		return j;
		
		
	}
	
	private static void exac(Comparable a[],int i,int j){
		Comparable k=a[i];
		a[i]=a[j];
		a[j]=k;
	}
	private static boolean less(Comparable i,Comparable j){
		return i.compareTo(j)<0;
	}

}
