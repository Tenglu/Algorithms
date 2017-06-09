package chapter2;

public class C_2_1_16 {

	public static void main(String[] args) {
		int[] a={1,3,4,5,8,7};
		System.out.println(check(a));
	}
	public static boolean check(int[] a){
		int length=a.length;
		int i=0;
		while(i+1<length){
			if(a[i]>a[i+1]){
				return false;
			}
			i++;
		}
		return true;
	}

}
