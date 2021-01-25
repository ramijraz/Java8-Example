package ParallelSort;
import java.util.Arrays;

public class Demolast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {5,8,2,45,63,12,78};
		System.out.println("Before Sorting : "+Arrays.toString(ar));
		Arrays.parallelSort(ar, 0, 5);
		System.out.println("After Sorting : "+Arrays.toString(ar));
	}

}
