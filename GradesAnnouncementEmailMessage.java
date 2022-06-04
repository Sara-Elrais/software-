package Messages;

public class GradesAnnouncementEmailMessage implements Msg{
	@Override
	public String prepareMessage(String placeHolders[]) {
		return "";
	}
	
	public boolean verifyGrades() {
		// code to verify Grades before announcement
		
		return true;
	}
}
