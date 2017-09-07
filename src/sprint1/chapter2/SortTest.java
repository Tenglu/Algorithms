package sprint1.chapter2;

public class SortTest {

	public static void main(String[] args) {
		Comparable[] a={9,5,1,7,4,3,6};
		Selection.sort(a);
		Selection.show(a);
		Comparable[] b={9,5,1,7,4,3,6};
		Insertion.sort(b);
		Insertion.show(b);
		Comparable[] c={9,5,1,7,4,3,6};
		Shell.sort(c);
		Shell.show(c);
		Comparable[] d={9,5,1,7,4,3,6};
		MergeSort.sort(d);
		MergeSort.show(d);
		Comparable[] e={9,5,1,7,4,3,6};
		Quick.sort(e);
		Quick.show(e);
		Comparable[] f={9,5,1,7,4,3,6};
		Quick3way.sort(f, 0, f.length-1);
		Quick3way.show(f);
		Comparable[] g={0,9,5,1,7,4,3,6};
		HeapSort.sort(a);;
		HeapSort.show(f);
	}

}
