package factory;

public class SMSNotification implements Notification{
	@Override
	public void notifyUser() {
		System.out.println("SMS sent to user");
	}

}
