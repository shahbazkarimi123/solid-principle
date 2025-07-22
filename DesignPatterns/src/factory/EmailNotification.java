package factory;

public class EmailNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Email is sent to user");
		
	}

}
