package chapter2;

public class ShellSort {
	public static void shellSort(int[] a){
		int H=a.length;
		int h=1;
		while(h<H/3){
			h=h*3+1;
		}
			while(h>=1){
			for(int i=h;i<H;i++){
				for(int j=i;j>h&&a[j]<a[j-h];j=j-h){
					exch(a,j,j-h);
				}
			}
			h=h/3;
		}
	}
	public static void exch(int[] a,int j,int k){
		int n=a[j];
		a[j]=a[k];
		a[k]=n;
	}
	public static void main(String[] args){
		int[] a={1,4,3,2};
		shellSort(a);
		for(int i:a){
			System.out.print(i+" ");
		}
	}

}
