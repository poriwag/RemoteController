
public class TurnMonitorOff implements Command {

	ElectronicDevice theDevice;
	
	public TurnMonitorOff(ElectronicDevice newDevice) {
		
		theDevice = newDevice;
	}
	@Override
	public void execute() {
		theDevice.off();
	}

}
