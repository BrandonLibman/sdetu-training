package labs;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		StudentDatabase user1 = new StudentDatabase("Joe", "784323051");
		
		user1.enroll();
		user1.showCourses();
		user1.setPhoneNumber("555-555-5555");
		user1.setCity("New York City");
		user1.setState("New York");
		System.out.println(user1.toString());
	}
 
}

class StudentDatabase {
	// Properties of student database
	private static int iD = 0; // Static ID
	private String userID; // Static ID + random 4-digit number between 1000 and 9000 + last 4 of SSN
	private String SSN;
	private String name;
	private String phone;
	private String city;
	private String state;
	private String email;
	private double balance;
	private String course;
	
	// Constructor
	public StudentDatabase(String name, String SSN) {
		this.SSN = SSN;
		this.name = name;
		iD++;
		email = name + "@studentdatabase.com";
		setUserID();
		
	}
	
	public void enroll() {
		System.out.println("Thank you for enrolling " + name + ".");
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
	public String getName() {
		return name;
	}
	
	public void setPhoneNumber(String phone) {
		this.phone = phone;
	}
	
	public String getPhoneNumber() {
		return phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCourse() {
		return course;
	}
	
	
	public void setUserID() {
		int max = 9000;
		int min = 1000;
		int range = (max - min) + 1;
		int randomNumber = (int) (Math.random() * range) + min;
		userID = iD + "" + randomNumber + SSN.substring(5, 9);
	}
	
	public void pay(double amount) {
		balance = balance-amount;
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public void showCourses() {
		System.out.println("You are currently taking: " + course);
	}
	
	@Override
	public String toString() {
		return "[User ID: " + userID + "]\n" + "[SSN: " + SSN + "]\n" + "[Name: " + name + "]\n" + "[Phone: " + phone + "]\n" + "[City: " + city + "]\n" + "[State: " + state + "]\n" + "[E-mail: " + email + "]\n";
	}
}