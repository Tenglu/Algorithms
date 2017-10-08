package sprint2.chapter2;

public class Selection {
	public static void sort(Comparable a[]){
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(less(a,j,i)){
					exac(a,i,j);
				}
			}
		}
	}
	private static void exac(Comparable a[],int i,int j){
		Comparable k=a[i];
		a[i]=a[j];
		a[j]=k;
	}
	private static boolean less(Comparable a[],int i,int j){
		return a[i].compareTo(a[j])<0;
	}

}
