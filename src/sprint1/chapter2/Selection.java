package sprint1.chapter2;

public class Selection {

	public static void sort(Comparable[] a){
		int N=a.length;
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				if(less(a[j],a[i])){
					exac(a,i,j);
				}
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
		System.out.println("========Selection Sort=========");
		for(Comparable i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
