package Gateways;

import Messages.DailyNewsMobileMessage;
import Messages.GradesAnnouncementMobileMessage;
import Messages.TaskAddedMobileMessage;

public class SMSGateway {
	private static SMSGateway instance = new SMSGateway();

	private SMSGateway(){}

	public static SMSGateway getInstance(){
		return instance;
	}

	public void sendMessage(Msg message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 

		if(message instanceof DailyNewsMobileMessage) {
			DailyNewsMobileMessage msg = (DailyNewsMobileMessage) message;

			msg.prepareMessage(placeHolders);
			
			// some code to send message
		}

		else if(message instanceof GradesAnnouncementMobileMessage) {
			GradesAnnouncementMobileMessage msg = (GradesAnnouncementMobileMessage) message;

			msg.prepareMessage(placeHolders);

			// some code to send message
		}

		else if(message instanceof TaskAddedMobileMessage) {
			TaskAddedMobileMessage msg = (TaskAddedMobileMessage) message;

			msg.prepareMessage(placeHolders);

			// some code to send message to user
		}
		
	}
}
