package ParallelSort;
import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {5,85,4,3,26,14,89,27,6,47};
		System.out.println("Array : "+Arrays.toString(ar));
		Arrays.parallelSort(ar);
		int len=ar.length;
		System.out.println("Sum of max and min element is : "+(ar[0]+ar[len-1]));
	}

}
