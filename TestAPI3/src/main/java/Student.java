
public class Student {
	private String firstName;
	private String lastName;
	private int SID;
	private String password;
	
	public Student(String firstName, String lastName, int SID, String password) {
		setFirstName();
		setLastName();
		setSID();
		setPassword();
	}
	
	// first name setter method
	public void setFirstName() {
		this.firstName = firstName;
	}
	
	// last name setter method
	public void setLastName() {
		this.lastName = lastName;
	}
	
	// SID setter method
	public void setSID() {
		this.SID = SID;
	}
	
	// password setter method
	public void setPassword() {
		this.password = password;
	}
	
	// first name getter method
	public String getFirstName() {
		return firstName;
	}
	
	// last name getter method
	public String getLastName() {
		return lastName;
	}
	
	// SID getter method
	public int getSID() {
		return SID;
	}
	
	// password getter method
	public String getPassword() {
		return password;
	}
	
	
	
}
