package sprint2.chapter1;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		System.out.println("=====Binary Search=====");
		int[] a={1,3,5,4,9,7};
		System.out.println(BinarySearch.rank(a, 5));

		System.out.println("=====BAG=====");
		Bag bag=new Bag<Integer>();
		bag.add(1);
		bag.add(3);
		bag.add(4);
		Iterator i=bag.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		System.out.println("");
		
		System.out.println("=====Stack=====");
		Stack stack=new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		Iterator j=stack.iterator();
		while(j.hasNext()){
			System.out.print(j.next()+" ");
		}
		System.out.println("");
		
		System.out.println("=====Queue=====");
		Queue queue=new Queue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.dequeue();
		Iterator k=queue.iterator();
		while(k.hasNext()){
			System.out.print(k.next()+" ");
		}
		System.out.println("");
		
		System.out.println("=====TwoSumFast=====");
		int[] b={1,4,3,2,5,-1,-2,-2};
		System.out.println(TwoSumFast.count(b));
		
		System.out.println("=====ThreeSumFast=====");
		int[] c={1,2,3,-6};
		System.out.println(ThreeSumFast.count(c));
		
		System.out.println("=====UnionFind=====");
		UnionFind uf=new UnionFind(5);
		uf.union(1, 3);
		uf.union(2, 4);
		System.out.println(uf.count+" "+uf.find(1)+" "+uf.connected(1, 3));
		
		System.out.println("=====WeightedQuickUnionUF=====");
		WeightedQuickUnionUF Weightuf=new WeightedQuickUnionUF(5);
		Weightuf.union(1, 3);
		Weightuf.union(2, 4);
		Weightuf.union(3, 4);
		System.out.println(Weightuf.count+" "+Weightuf.find(1)+" "+Weightuf.connected(1, 3));
		Weightuf.printUF();
	}
}
