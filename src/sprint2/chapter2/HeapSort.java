package sprint2.chapter2;

public class HeapSort {
	public static void sort(Comparable[] a){
		int length=a.length/2;
		for(int i=length;i>=0;i--){
			sink(a,i,a.length-1);
		}
		int j=a.length-1;
		while(j>0){
			exac(a,0,j--);
			sink(a,0,j);
		}
	}

	private static void sink(Comparable[] a,int i,int max){
		while(i<=max/2){
			int j=i*2;
			if(j<max&&less(a,j,j+1)==true){
				j++;
			}
			if(less(a,i,j)==true){
				exac(a,i,j);
			}else{
				break;
			}
			i=j;
		}
	}
	private static void exac(Comparable[] a,int i,int j){
		Comparable k=a[i];
		a[i]=a[j];
		a[j]=k;
	}
	private static boolean less(Comparable[] a,int i, int j){
		return a[i].compareTo(a[j])<0;
	}
}
