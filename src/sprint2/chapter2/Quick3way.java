package sprint2.chapter2;

public class Quick3way {
	public static void quick3way(Comparable[] a){
		sort(a,0,a.length-1);
	}
	private static void sort(Comparable[] a,int lo,int hi){
		if(lo>=hi) return;
		int lt=lo,gt=hi,i=lo+1;
		Comparable v=a[lo];
		while(i<=gt){
			int c=a[i].compareTo(v);
			if(c<0){
				exac(a,i++,lt++);
			}else if(c>0){
				exac(a,i,gt--);
			}else{
				i++;
			}
		}
		sort(a,lo,lt-1);
		sort(a,gt+1,hi);
	}
	private static void exac(Comparable[] a,int i,int j){
		Comparable k=a[i];
		a[i]=a[j];
		a[j]=k;
	}
	private static int less(Comparable[] a,int i, int j){
		return a[i].compareTo(a[j]);
	}
}
