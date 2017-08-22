package sprint1.chapter3.C3_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class C3_1_1 {

	public static void main(String[] args) {
		Map<String,Double> grade=new HashMap<String,Double>();
		grade.put("A+", 4.33);
		grade.put("A", 4.00);
		grade.put("A-", 3.67);
//		for(String key:grade.keySet()){
//			System.out.println(grade.get(key));	
//		}
		String key="";
		Double value=0.0;
		while(key!="Z"){
		key="";
		Scanner s=new Scanner(System.in);
		key=s.next();
		if(grade.containsKey(key))
			value=grade.get(key);
			System.out.println(value);
		}
	}
	
	

}

//class symbleTable{
//	private class grade{
//		private String key;
//		private double value;
//		public grade(String key,double value){
//			this.key=key;
//			this.value=value;
//			
//		}
//	}
//	public void put(){
//	}
//	public double get(){
//		double result=0;
//		
//		return result;
//	}
//	
//
//}