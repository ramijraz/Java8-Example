package ParallelSort;
import java.util.Arrays;
import java.util.Scanner;

public class CharSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.next();
		char[] ar=str.toCharArray();
		Arrays.parallelSort(ar);
		str=new String(ar);
		System.out.println(str);
	}

}
