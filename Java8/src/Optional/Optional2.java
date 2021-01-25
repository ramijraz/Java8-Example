package Optional;
import java.util.Optional;

public class Optional2 {
	String addr;
	String def_addr="India";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional2 ob=new Optional2();
		Optional<String>n=Optional.ofNullable(ob.addr);
		System.out.println(n.orElse(ob.def_addr));
	}

}
