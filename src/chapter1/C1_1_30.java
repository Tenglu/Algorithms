package chapter1;
import java.util.*;

public class C1_1_30 {

	public static void main(String[] args) {
		int N=100;
		boolean a[][]=new boolean[N][N];
		a[0][0]=false;
		for(int i=1;i<N;i++){
			for(int j=i;j<N;j++){
				if(gcd(i,j)==1){
					a[i][j]=true;
					a[j][i]=true;
				}else{
					a[i][j]=false;
					a[j][i]=false;
				}
			}
		}
		for(boolean[] b1:a){
			for(boolean b2:b1){
				System.out.print(b2+" ");
			}
			System.out.println("");
		}
	}
	public static int gcd(int a,int b){
		if(b==0){
			return a;
		}
		if(a%b==0){
			return b;
		}else{
			if(a>b){
				//System.out.println("a>b "+"a:"+a+" b:"+b);
				return gcd(b,a%b);
			}else{
				//System.out.println("a<b "+"a:"+a+" b:"+b);
				return gcd(a,b%a);
			}
		}
	}

}
