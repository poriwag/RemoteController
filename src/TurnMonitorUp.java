
public class TurnMonitorUp implements Command{
	
	ElectronicDevice theDevice;
	
	public TurnMonitorUp(ElectronicDevice newDevice) {
		
		theDevice = newDevice;
	}

	@Override
	public void execute() {
		
		theDevice.volumeUp();
	}
	
	
}
