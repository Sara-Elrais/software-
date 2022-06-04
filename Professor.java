package Users;

import java.sql.Date;

public class ProfessorObserver extends Observer{
	String name;
	String department;
	Date hirringDate;
	String PhDTopic;
	String email;
	String phoneNumber;
	
	
	public ProfessorObserver(String name, String department, Date hirringDate, String phDTopic, String email,
			String phoneNumber) {
		super();
		this.name = name;
		this.department = department;
		this.hirringDate = hirringDate;
		PhDTopic = phDTopic;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public ProfessorObserver(Course course){
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHirringDate() {
		return hirringDate;
	}
	public void setHirringDate(Date hirringDate) {
		this.hirringDate = hirringDate;
	}
	public String getPhDTopic() {
		return PhDTopic;
	}
	public void setPhDTopic(String phDTopic) {
		PhDTopic = phDTopic;
	}


	@Override
	public void notify(String message) {
		//do some stuff
	}
	
	
	
}
