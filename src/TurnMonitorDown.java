
public class TurnMonitorDown implements Command {

	ElectronicDevice theDevice;
	
	public TurnMonitorDown(ElectronicDevice newDevice)
	{
		theDevice = newDevice;
	}
	
	public void execute() {
		
		theDevice.volumeDown();
	}
}
