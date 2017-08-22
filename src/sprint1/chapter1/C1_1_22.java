package sprint1.chapter1;
import java.util.Arrays;

public class C1_1_22 {
	static int depth=0;
	public static int rank(int key, int[] num){
		Arrays.sort(num);
		return binarySearch(key,num,0,num.length-1,(num.length-1)/2);
	
	}
	public static int binarySearch(int key,int[] num,int lo,int hi,int mid){
		depth++;
		if(lo==hi){
			if(key!=num[hi]){
				return -1;
			}else{
				return num[hi];
			}
			
		}
		else{
			if(key>num[mid]){
				System.out.println("key>mid "+(mid+1)+" "+hi+" "+(mid+hi+1)/2);
				return binarySearch(key,num,mid+1,hi,(mid+hi+1)/2);
			}else if(key<num[mid]){
				System.out.println("key<mid "+lo+" "+(mid-1)+" "+(lo+mid-1)/2);
				return binarySearch(key,num,lo,mid-1,(lo+mid-1)/2);
			}else{
				return key;
			}
		}
	}
	public static void main(String[] args) {
		int[] num={1,3,5,7,9};
		int key=9;
		int result=rank(key,num);
		System.out.println(result+" Depth:"+depth);
	}

}
