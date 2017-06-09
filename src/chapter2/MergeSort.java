package chapter2;

public class MergeSort {
	public static void mergeSort(int[] a,int lo,int hi){
		int h=lo+hi/2;
		
//		int i=mergeSort(a,lo,h);
//		int j=mergeSort(a,h+1,hi);
//		sort(i,j);
	}
	
	public static void main(String[] args){
		int[] a={1,4,3,2};
		int lo=0;
		int hi=a.length-1;
		mergeSort(a,lo,hi);
	}

	public static void sort(){
		
	}
}
