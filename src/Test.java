import java.util.HashSet;
import java.util.Set;


public class Test {
	private static final Set<String> HIDE_SET = new HashSet<String>(){{
		   add("0");
		   add("1");
		   add("2");
	    }};
	public static void main(String[] args){
		String value="3";
		if (!HIDE_SET.contains(value)) {
            System.out.println("Hide value is illegal,the Legal values are :"
                    + HIDE_SET);


        }
	}
	
}
