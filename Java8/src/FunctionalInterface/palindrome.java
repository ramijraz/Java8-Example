package FunctionalInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
 
public class palindrome {
	static boolean isPalindromeString(String input1) {
		input1=input1.toLowerCase();
		int digit=input1.length();
		boolean isPalindrome=true;
		int range=digit/2;
		if(digit%2==0)
			range--;
			for(int i=0;i<=range;i++) {
				if (input1.charAt(i) != input1.charAt(digit - i - 1))
					isPalindrome = false;
				}
		
			return isPalindrome;
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> word=new ArrayList<>( Arrays.asList("Malayalam", "valid", "Dial", "Tears", "Hard", "Racecar", "Level", "Crazy", "Madam", "Sir"));
		Predicate<String> p=str->isPalindromeString(str);
		word.stream().filter(p).forEach(System.out::println);
	}

}
