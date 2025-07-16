package dependencyInversionPrinciple;

// High-level modules should not depend on low-level modules. Both should depend on abstractions.
public class DIPDemo {

	public static void main(String[] args) {
		Switchable lightBulb = new LightBulb();
		Switch lightSwitch = new Switch(lightBulb);
		lightSwitch.operate(true);
		lightSwitch.operate(false);

	}

}
