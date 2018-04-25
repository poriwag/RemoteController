import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
	public static void main(String[] args) {
		
		ElectronicDevice newDevice = MonitorRemote.getDevice();
		
		TurnMonitorOn onCommand = new TurnMonitorOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		
		//------Turning Monitor Off ---------
		
		TurnMonitorOff  offCommand = new turnTvOff(newDevice);
		onPressed = new DeviceButton(offCommand);
		onPressed.press();
		
		//====Turning Volume Up ==========
		
		TurnMonitorUp upCommand = new TurnTvUp(newDevice);
		onPressed = new DeviceButton(upCommand);
		onPressed.press();
		onPressed.press();
		
		
	}
}
