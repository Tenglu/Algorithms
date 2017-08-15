package chapter3.C3_2;

public class BSTTest {

	public static void main(String[] args) {
		BST bst=new BSTImpl();
		bst.put("2", "22");
		bst.put("1", "11");
		bst.put("3", "33");
		System.out.println(bst.get("1"));
		System.out.println(bst.contains("1"));
		//System.out.println(bst.size());
		//System.out.println(bst.toString());
	}

}
