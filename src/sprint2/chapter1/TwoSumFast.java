package sprint2.chapter1;

import java.util.Arrays;

public class TwoSumFast {
	public static int count(int[] a){
		int count=0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			if(BinarySearch.rank(a, -a[i])>i){
				count++;
			}
		}
		
		return count;
	}

}
