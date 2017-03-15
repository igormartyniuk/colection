import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Parliament> parliaments = new ArrayList<>();
		
		System.out.println("enter 1 add fraction");
		
		Fraction fraction = new Fraction("oposition");
		
		System.out.println(fraction.getFractionName());
		
		fraction.addDeputy();
		
		
		
		System.out.println(fraction.deputies.size());
		System.out.println(fraction.deputies.get(0));
		
	}

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
