package sprint1.chapter3;

public class Chapter3Test {
	public static void main(String[] args){
		SequentialSearch<Integer,Integer> ss=new SequentialSearch<Integer,Integer>();
		ss.put(1, 1);
		ss.put(3, 3);
		ss.print();
		System.out.println(ss.get(2));
		
		BinarySearchST<Integer,Integer> bs=new BinarySearchST<>(10);
		bs.put(2, 2);
		bs.print();
		bs.put(1, 1);
		bs.print();
		bs.put(10, 10);
		bs.print();
		bs.put(5, 5);
		bs.print();
	}
	
	

}
