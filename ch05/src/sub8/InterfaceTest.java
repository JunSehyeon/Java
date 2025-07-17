package sub8;

public class InterfaceTest {
	
	public static void main(String[] args) {
		RemoteLG lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundDown();
		lg.powerOff();
		
		RemoteSamsong samsong = new RemoteSamsong();
		samsong.powerOn();
		samsong.chUp();
		samsong.soundDown();
		samsong.powerOff();
		
	    Bulb bulb = new Bulb();
	    Socket socket = new Power(bulb);
	    
	    socket.switchOn();
	    socket.switchOff();
	}
	
}
