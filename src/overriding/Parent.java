package overriding;

public class Parent {

	private int id;
	private String name;
	private String surname;
	private String address;
	private int pinCode;
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Parent(int id, String name, String surname, String address, int pinCode) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.pinCode = pinCode;
	}
	
	protected void printInformation() {
		
		System.out.println("This is parent class........\n");
		System.out.println(this.id+" "+this.name+" "+this.surname+" "+this.address+" "+this.pinCode);
	}
	
	public static void showInformation() {
		
		System.out.println("This is static method from parent class....");
	}
	
	private void show() {		
		System.out.println("This is a private show() method from parent class.");
	}
	
	// return type should be same or subtype
	protected Object display() {
		System.out.println("This is parent class display method...........");
		return address;		
	}
}
