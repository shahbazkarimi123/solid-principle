package dependencyInversionPrinciple;

public class Switch {
	private Switchable device;
	
	public Switch(Switchable device) {
		this.device = device;
	}
	
	void operate(boolean on) {
		if(on) {
			
			device.turnOn();
		}else {
			device.turnOff();
		}
	}

}
