import java.util.Scanner;
public class Avenger {
	String name;
	int age;
	String power;
	String weapon;
	String planet;
	void getDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name");
		name = input.nextLine();
		System.out.println("Enter age");
		age = input.nextInt();
		System.out.println("Enter power");
		power = input.next();
		System.out.println("Enter weapon");
		weapon = input.next();
		System.out.println("Enter planet");
		planet = input.next();
		
	}
	void displayDetails() {
		System.out.println("This avenger has the following "
				+ "information");
		System.out.println(name);
		System.out.println(age);
		System.out.println(power);
		System.out.println(weapon);
		System.out.println(planet);
		System.out.println();
	}
	public static void main(String args[]) {
		//Create an array of 5 Avenger class objects
		Avenger[] avenger = {new Avenger(),
				new Avenger(), new Avenger(),
				new Avenger(), new Avenger()};
		//Get avenger details
		for(int i = 0; i<=4; i++) {
			avenger[i].getDetails();
			System.out.println("Next Avenger");
			System.out.println("=============");
		}
		
		//Display avenger details
		for(int i = 0; i<=4; i++) {
			avenger[i].displayDetails();
			System.out.println("=============");
		}
		
		
	}
}
