package sprint1.chapter1;

public class C1_1_24 {
	public static void main(String[] args){
		
		int result=gcd(Integer.valueOf(args[0]),Integer.valueOf(args[1]));
		System.out.println(result);
	}
	public static int gcd(int a,int b){
		if(b==0){
			return a;
		}
		if(a%b==0){
			return b;
		}else{
			if(a>b){
				System.out.println("a>b "+"a:"+a+" b:"+b);
				return gcd(b,a%b);
			}else{
				System.out.println("a<b "+"a:"+a+" b:"+b);
				return gcd(a,b%a);
			}
		}
	}
}
