package StringJoiner;
import java.util.StringJoiner;

public class MargeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj1=new StringJoiner(",");
		StringJoiner sj2=new StringJoiner("-");
		sj1.add("Burdwan");
		sj1.add("Guskara");
		sj1.add("Orgram");
		sj2.add("Kolkata");
		sj2.add("Hoogly");
		sj2.add("Howrah");
		System.out.println(sj1.merge(sj2));
		System.out.println(sj2.merge(sj1));
	}

}
