package Gateways;

import Messages.DailyNewsEmailMessage;
import Messages.GradesAnnouncementEmailMessage;
import Messages.TaskAddedEmailMessage;
import Messages.MsgFactory;
public class EmailGateway {

	private static EmailGateway instance = new EmailGateway();

	private EmailGateway(){}

	public static EmailGateway getInstance(){
		return instance;
	}


	public void sendMessage(Msg message, String user) {

		String[] placeHolders = new String[] {}; // set some place holders here 

		if(message instanceof DailyNewsEmailMessage) {
			DailyNewsEmailMessage dailyNewsEmailMessage = new DailyNewsEmailMessage;


			// some code to send message
		}

		else if(message instanceof GradesAnnouncementEmailMessage) {
			GradesAnnouncementEmailMessage announcementEmailMessage = (GradesAnnouncementEmailMessage) message;

			announcementEmailMessage.prepareMessage(placeHolders);

			// some code to send message
		}

		else if(message instanceof TaskAddedEmailMessage) {
			TaskAddedEmailMessage addedEmailMessage = (TaskAddedEmailMessage) message;

			addedEmailMessage.prepareMessage(placeHolders);

			// some code to send message by email to user
		}
		
	}
}
