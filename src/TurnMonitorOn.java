
public class TurnMonitorOn implements Command {

	ElectronicDevice theDevice;
	
	public TurnMonitorOn(ElectronicDevice newDevice) {
		
		theDevice = newDevice;
	}
	@Override
	public void execute() {
		theDevice.on();
	}

}
