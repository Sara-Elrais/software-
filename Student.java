package Users;

public class StudentObserver extends Observer{
	String name;
	int Id;
	String email;
	String phoneNumber;
	
	
	
	public StudentObserver(String name, int id, String email, String phoneNumber) {
		super();
		this.name = name;
		Id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public StudentObserver(Course course){
		this. course =  course;
		this. course.attach(this);
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}


	@Override
	public void notify(String message) {
		//do some stuff
	}
	
}
