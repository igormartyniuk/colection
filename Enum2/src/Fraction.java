import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fraction {

	Scanner scanner = new Scanner(System.in);
	List<Deputy> deputies = new ArrayList<>();

	private String fractionName;
	
	public String getFractionName() {
		return fractionName;
	}

	public void setFractionName(String fractionName) {
		this.fractionName = fractionName;
	}

	public Fraction(String fractionName) {
		super();
		this.fractionName = fractionName;
	}

	public void addDeputy(){
	
	
	System.out.println("enter weight");
	int weight = scanner.nextInt();
	System.out.println("enter height");
	int height = scanner.nextInt();
	System.out.println("enter first name");
	String firstName = scanner.nextLine();
	System.out.println("enter last name");
	String lastName = scanner.nextLine();
	System.out.println("enter bribery status");
	boolean bribery = scanner.nextBoolean();
	
	deputies.add(new Deputy(weight, height, firstName, lastName, bribery));
	
	
	
	}
	
	public void removeDeputy(){
		
		List<Deputy> deputies = new ArrayList<>();
		
		int index = scanner.nextInt();
		deputies.remove(index);
		
		
		
		
		
	}
}
