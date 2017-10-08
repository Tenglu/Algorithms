package sprint2.chapter2;

public class MergeSort {
	static Comparable[] aux;
	public static void MergeSort(Comparable[] a){
		aux=new Comparable[a.length];
		sort(a,0,a.length-1);
	}
	
	private static void sort(Comparable[] a,int lo,int hi){
		if(lo>=hi){
			return;
		}
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	}
	private static void merge(Comparable[] a,int lo,int mid,int hi){
		int x=lo;
		int y=mid+1;
		for(int i=lo;i<=hi;i++){
			aux[i]=a[i];
		}
		for(int i=lo;i<=hi;i++){
			
			if(x>mid) {
				a[i]=aux[y++];
				
			}
			else if(y>hi) {
				a[i]=aux[x++];
			}
			else if(less(aux,x,y)) {
				a[i]=aux[x++];
			}
			else{
				a[i]=aux[y++];
			}
		}

	}
	private static void exac(Comparable a[],int i,int j){
		Comparable k=a[i];
		a[i]=a[j];
		a[j]=k;
	}
	private static boolean less(Comparable a[],int i,int j){
		return a[i].compareTo(a[j])<0;
	}
}
