import java.util.ArrayList;

import Gateways.EmailGateway;
import Messages.TaskAddedEmailMessage;
import Users.Professor;
import Users.Student;
import Users.TA;

public class Course {
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;

	ArrayList<Observer> observersForEmailNotification;
	ArrayList<Observer> observersForSMSNotification;
	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<String>();
		exams = new ArrayList<String>();
		grades = new ArrayList<String>();

		observersForEmailNotification = new ArrayList<Observer>();
		observersForSMSNotification= new ArrayList<Observer>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void subscribeobserversForSMSNotification(Observer observer) {
		observersForSMSNotification.add(observer);
	}

	public void subscribeobserversForEmailNotification(Observer observer) {
		observersForEmailNotification.add(observer);
	}
	// in main l mfrod
	//n3ml object mn kol command w n3rf object mn invoker w w invoker.takecommand(f1) w invoker.placeholder fl akher
	public void AddAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody};
		// do some logic here 
		
		notifyAllUsers(placeholders);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllObservers(String[] placeholders) {
		// notify users by email
		MsgFactory  msgfactory  = new MsgFactory ;
        Msg msg=msgfactory.CreateMsg("TaskAddedEmailMessage");
		String notification = msg.prepareMessage(placeholders);
		
		// open connection for Email gateway and do some configurations to the object
		EmailGateway emailGateway = EmailGateway.getInstance();

		for (Observer observer : observersForEmailNotification) {
			observer.notify();
			emailGateway.sendMessage(notification, observer.getEmail());
		}

	}
}
