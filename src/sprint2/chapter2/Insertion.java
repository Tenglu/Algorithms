package sprint2.chapter2;

public class Insertion {
	public static void sort(Comparable[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i;j>0&&less(a,j,j-1);j--){
				exac(a,j,j-1);
			}
		}
	}

	private static void exac(Comparable[] a,int i ,int j){
		Comparable c=a[i];
		a[i]=a[j];
		a[j]=c;
	}
	private static boolean less(Comparable[] a,int i, int j){
		return a[i].compareTo(a[j])<0;
	}
}
