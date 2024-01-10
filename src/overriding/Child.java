package overriding;

public class Child extends Parent {

	private int id;
	private String name;
	private String surname;
	private int houseNumber;
	private String city;
	private int pinCode;
	
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Child(int id, String name, String surname, int houseNumber, String city, int pinCode) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.houseNumber = houseNumber;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	@Override
	public void printInformation() {
		
		System.out.println("This is child class........\n");
		System.out.println(this.id+" "+this.name+" "+this.surname+" "+this.houseNumber+" "+this.city+" "+this.pinCode);
	}
	
	// This is method hiding
	//@Override
	public static void showInformation() {
		
		System.out.println("This is static method from child class....");
	}
	
	//@Override => private methods can not be overridden
	private void show() {		
		System.out.println("This is a private show() method from parent class.");
	}
	
	@Override // return type should be same or subtype
	protected String display() {
		System.out.println("This is child class display method...........");
		return city;
	}
	
}
