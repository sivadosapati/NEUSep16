
public abstract class Phone {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void makeCall();

	public abstract void answerCall();

	public Phone() {

	}

	public Phone(String name) {
		this.name = name;
	}

	public String toString() {
		return "Phone Name -> " + name;
	}
}

class Samsung extends Phone {

	public void makeCall() {
		System.out.println("Samsung phone is making a call");
	}

	public void answerCall() {
		System.out.println("Samsung phone is answering a call");
	}

	public Samsung(String name) {
		super(name);
	}

}

class MotorolaPhone extends Phone {

	@Override
	public void makeCall() {
		System.out.println("Motorola making a call");

	}

	@Override
	public void answerCall() {
		System.out.println("Motorola answering a call");

	}

}

abstract class FlipMotorolaPhone extends MotorolaPhone{
	
}
