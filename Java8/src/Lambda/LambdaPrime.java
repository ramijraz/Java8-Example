package Lambda;
import java.util.*;
public class LambdaPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25));
	System.out.println("Prime Numbers are");
	al.forEach(num->{
		int flag=1;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.println(num+" ");
		}
		});
			}
	}
