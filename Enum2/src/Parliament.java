import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parliament {
	
	Scanner scanner =  new Scanner(System.in);
	List<Fraction> fractions = new ArrayList<>();
	
	
	public void addFraction(){
		
		String fractionName = scanner.nextLine();
		
		fractions.add(new Fraction(fractionName));
		
		
		
	}

	
	
	
}
