package sprint2.chapter2;

public class Test {

	public static void main(String[] args) {
		System.out.println("====Selection Sort=====");
		Comparable[] a={1,4,3,2,5};
		Selection.sort(a);
		for(Comparable i:a){
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("====Insertion Sort=====");
		Comparable[] b={1,4,3,2,5,9,8,7};
		Insertion.sort(b);
		for(Comparable i:b){
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("====Shell Sort=====");
		Comparable[] c={1,4,3,2,5,9,8,7};
		Shell.sort(c);
		for(Comparable i:c){
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("====Merge Sort=====");
		Comparable[] d={1,4,3,2,5,9,8,7};
		MergeSort.MergeSort(d);
		for(Comparable i:d){
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("====Quick Sort=====");
		Comparable[] e={1,4,3,2,5,9,8,7};
		QuickSort.QuickSort(e);
		for(Comparable i:e){
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("====Quick3way Sort=====");
		Comparable[] f={1,4,3,2,5,9,8,7};
		Comparable[] g={3,3,3,1,1,1,2,2,2,6,6,6,4,4,4};
		Quick3way.quick3way(g);
		for(Comparable i:g){
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		System.out.println("====Heap Sort=====");
		Comparable[] h={1,4,3,2,5,9,8,7};
		HeapSort.sort(h);
		for(Comparable i:h){
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
