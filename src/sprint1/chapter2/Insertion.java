package sprint1.chapter2;

public class Insertion {

	public static void sort(Comparable[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i;j>0&&less(a[j],a[j-1]);j--){
				exac(a,j,j-1);
			}
		}
	}
	public static void exac(Comparable[] a,int i, int j){
		Comparable temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static boolean less(Comparable a,Comparable b){
		
		return a.compareTo(b)<0;
	}
	public static void show(Comparable[] a){
		System.out.println("========Insertion Sort=========");
		for(Comparable i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
