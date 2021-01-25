package FunctionalInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(24,2,10,15,54,51,19));
		Consumer<ArrayList<Integer>> c=num->num.forEach(
				i->System.out.println(i+(i%2==0?" even":" odd")));
		
		c.accept(list);
	}

}
