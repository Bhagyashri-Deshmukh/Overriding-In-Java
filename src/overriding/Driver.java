package overriding;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent1 = new Parent(1, "Mukesh", "Desai", "Pune", 12121);
		parent1.printInformation();
		
		// this is a static method which could not be overriden.
		parent1.showInformation();
		
		// return type should be same or subtype
		parent1.display();
		
		System.out.println("===========================================");
		
		Parent parent2 = new Child(2, "Pratik", "Desai", 11, "Pune", 12121);
		parent2.printInformation();
		
		// static methods can not be overriden, here parent clas method gets executed.
		parent2.showInformation();
		
		// return type should be same or subtype
		parent2.display();
	}

}
