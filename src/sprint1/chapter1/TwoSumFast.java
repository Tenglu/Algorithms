package sprint1.chapter1;

import java.util.Arrays;

public class TwoSumFast {
	public static int count(int[] a){
		Arrays.sort(a);
		int count=0;
		for(int i=0;i<a.length;i++){
			if(BinarySearch.rank(-a[i],a)>i){
				count++;
			}
		}
		
		return count;
		
	}
	public static void main(String[] args){
		int a[]={-3,-2,-1,0,1,2,3,3};
		System.out.println(count(a));
	}

}
