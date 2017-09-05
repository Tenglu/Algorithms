package sprint1.chapter2;

public class Shell {

	public static void sort(Comparable[] a){
		int N=a.length;
		int h=1;
		while(h<N/3){
			h=h*3+1;
		}
		while(h>=1){
			for(int i=h;i<N;i++){
				for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h){
					exac(a,j,j-h);
				}
			}
			h=h/3;			
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
		System.out.println("========Shell Sort=========");
		for(Comparable i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
