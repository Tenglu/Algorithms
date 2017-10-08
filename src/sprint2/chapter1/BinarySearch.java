package sprint2.chapter1;

import java.util.Arrays;

public class BinarySearch {
	public static int rank(int a[],int i){
		Arrays.sort(a);
		int lo=0;
		int hi=a.length-1;
		while(lo<=hi){
			int mid=lo+(hi-lo)/2;
			if(i==a[mid]){
				return mid;
			}
			else if(a[mid]>i){
				hi=mid-1;
			}else{
				lo=mid+1;
			}
		}
		return -1;
	}

}
