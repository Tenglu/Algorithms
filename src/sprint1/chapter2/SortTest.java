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
	}

}
