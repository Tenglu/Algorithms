package sprint2.chapter1;

public class ThreeSumFast {
	public static int count(int[] a){
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(BinarySearch.rank(a,-a[i]-a[j])>0){
					count++;
				}
			}
		}
		return count;
	}

}
