package Lambda;
import java.util.*;
public class LambdaOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>(Arrays.asList("ram","sam","roman","ranjan"));
	al.forEach(word->System.out.println((word.length()%2!=0)?word+" ":""));
	}
}
