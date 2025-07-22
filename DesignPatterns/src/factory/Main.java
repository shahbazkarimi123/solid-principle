package factory;

public class Main {

	public static void main(String[] args) {
		FactoryMethod factoryMethod = new FactoryMethod();
		Notification notification = factoryMethod.createNotification("sms");
		notification.notifyUser();

	}

}
