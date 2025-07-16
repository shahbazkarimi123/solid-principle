package dependencyInversionPrinciple;

public class LightBulb implements Switchable{

	@Override
	public void turnOn() {
		System.out.println("Switch is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Switch is off");
		
	}

}
