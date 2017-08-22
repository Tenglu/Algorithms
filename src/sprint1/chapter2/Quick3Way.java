package sprint1.chapter2;

public class Quick3Way {

	public static void main(String[] args) {
		Comparable[] a={'R','B','W','W','R','W','B','R','R','W','B','R'};
		sort(a,0,a.length-1);
		for(Comparable i:a){
			System.out.print(i+" ");
		}
	}
	public static void sort(Comparable[] a,int lo, int hi){
		if(hi<=lo) return;
		int lt=lo,i = lo+1,gt=hi;
		Comparable v= a[lo];
		while(i<=gt){
			int cmp=a[i].compareTo(v);
			System.out.print(lo+" "+v+" "+lt+" "+i+" "+gt);
			if(cmp<0) exch(a,lt++,i++);
			else if(cmp>0) exch(a,i,gt--);
			else i++;
			System.out.println();
		}
		sort(a,lo,lt-1);
		sort(a,gt+1,hi);
	}
	public static void exch(Comparable[] a,int i,int j){
		Comparable temp= a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
