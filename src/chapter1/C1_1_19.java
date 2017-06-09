package chapter1;
import java.util.ArrayList;
import java.util.List;

public class C1_1_19 {
	List a=new ArrayList<Integer>();
	public static long FA(int N){
		if(N==0) return 0;
		if(N==1) return 1;
		return F(N-1)+F(N-2);
	}

	public static long F(int N){
		if(N==0) return 0;
		if(N==1) return 1;
		return F(N-1)+F(N-2);
	}
	public static void main(String[] args){
		for(int N=0;N<100;N++){
			System.out.println(N+" "+F(N));
		}
	}

}

