package sprint1.chapter1;

import java.util.Iterator;

public class Test {
	public static void main(String[] args){
		System.out.println("==========>Test Stack<==========");
		Stack<String> a=new Stack<String>();
		a.push("a");
		a.push("c");
		a.push("d");
		a.pop();
		a.pop();
		Iterator is=a.iterator();
		while(is.hasNext()){
			System.out.println(is.next());
		}
		System.out.println("==========>Test Queue<==========");
		Queue<String> queue=new Queue<String>();
		queue.enqueue("abc");
		queue.enqueue("edf");
		queue.enqueue("xyz");
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		Iterator i=queue.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("==========>Test Bag<==========");
		Bag<String> bag=new Bag<String>();
		bag.add("123");
		bag.add("456");
		
		Iterator ii=bag.iterator();
		while(ii.hasNext()){
			System.out.println(ii.next());
		}
		
	}
	
}
