import java.util.Scanner;

public class Deputy extends Human {
	
	Scanner scanner = new Scanner(System.in);
	
	private String firstName;
	private String lastName;
	private boolean bribery;
	private int bribeSize;
	
	public Deputy(int weight, int height, String firstName, String lastName, boolean bribery) {
		super(weight, height);
		this.firstName = firstName;
		this.lastName = lastName;
		this.bribery = bribery;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isBribery() {
		return bribery;
	}

	public void setBribery(boolean bribery) {
		this.bribery = bribery;
	}

	public int getBribeSize() {
		return bribeSize;
	}

	public void setBribeSize(int bribeSize) {
		this.bribeSize = bribeSize;
	}

	public void giveBribe(){
		if(bribery == false){
			System.out.println("Not taking bribes");
		}else{
			System.out.println("enter bribery size");
			int bribeTry = scanner.nextInt();
			if(0 < bribeTry && bribeTry < 5000){
				bribeTry = bribeSize;
			}else if (bribeTry > 5000){
				System.out.println("Police have planted in prison");
			}
			
		}
	}

	@Override
	public String toString() {
		return "Deputy [firstName=" + firstName + ", lastName=" + lastName + ", bribery=" + bribery + ", bribeSize="
				+ bribeSize + ", getWeight()=" + getWeight() + ", getHeight()=" + getHeight() + "]";
	}
	
}
