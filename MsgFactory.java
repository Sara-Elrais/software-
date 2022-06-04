public class MsgFactory {

    public static Msg CreateMsg(String MsgType) {
        if (MsgType == null || MsgType.isEmpty())
            return null;
        switch (MsgType) {
            case "DailyNewsEmailMessage":
                return new DailyNewsEmailMessage();
            case "DailyNewsMobileMessage":
                return new DailyNewsMobileMessage();
            case "GradesAnnouncementEmailMessage":
                return new GradesAnnouncementEmailMessage();
            case "GradesAnnouncementMobileMessage":
                return new GradesAnnouncementMobileMessage();
            case "TaskAddedEmailMessage":
                return new TaskAddedEmailMessage();
            case "TaskAddedMobileMessage":
                return new TaskAddedMobileMessage();
            default:
                throw new IllegalArgumentException("Unknown MsgType " + MsgType);
        }
    }
}