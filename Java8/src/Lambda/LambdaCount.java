package Lambda;
import java.util.*;

interface WordCount{
	int count(String str);
}

public class LambdaCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount lc= str -> {
			return (str.split(" ").length);
		};
		System.out.println(lc.count("he is a boy and"));
	}

}
