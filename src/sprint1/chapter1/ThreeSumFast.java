package sprint1.chapter1;

import java.util.Arrays;

public class ThreeSumFast {
	public static int count(int[] a){
		int count=0;
		int N=a.length;
		Arrays.sort(a);
		for(int i=0;i<N;i++){
			for (int j=i+1;j<N;j++){
				int n=0;
				int num=BinarySearch.rank(-a[i]-a[j], a);
				if(num>j){
					System.out.println(i+": "+a[i]);
					System.out.println(j+": "+a[j]);
					System.out.println(num+": "+a[num]);
					System.out.println();
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] a={-1,-2,3,4,6,-10};
		System.out.println(count(a));
	}

}
