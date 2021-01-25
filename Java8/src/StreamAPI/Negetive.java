package StreamAPI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Negetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>n=new ArrayList<Integer>(Arrays.asList(1,2,-3,-5,-8,9,-12));
		List<Integer>m=n.stream().filter(x->(x<0 && x%2==0)).collect(Collectors.toList());
		System.out.println(m);
	}

}
