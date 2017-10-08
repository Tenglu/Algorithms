package sprint2.chapter2;

public class Shell {
	public static void sort(Comparable a[]){
		int length=a.length;
		int h=1;
		while(h<length/3){
			h=h*3+1;
		}
		while(h>=1){
			for(int i=h;i<length;i++){
				for(int j=i;j>h&&less(a,j,j-h);j=j-h){
					exac(a,j,j-h);
				}
			}
			h=h/3;
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
