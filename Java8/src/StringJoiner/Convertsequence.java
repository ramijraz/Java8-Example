package StringJoiner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Convertsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>(Arrays.asList("c","c++","java","python","html"));
		StringJoiner sj=new StringJoiner(",","{","}");
		list.forEach(e->sj.add(e));
		System.out.println(sj);
	}

}
