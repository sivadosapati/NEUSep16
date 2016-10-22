
public class TestPhones {
	public static void main(String args[]) {
		Samsung s = new Samsung("Galaxy");
		MotorolaPhone m = new MotorolaPhone();
		m.setName("Moto");
		s.makeCall();
		m.answerCall();
	}
}
