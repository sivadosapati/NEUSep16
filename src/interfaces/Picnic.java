package interfaces;

public class Picnic {

	public static void main(String args[]) {
		iPhone ip = new iPhone();
		Camera c = new Camera();
		Samsung s = new Samsung();
		
		Picnic p = new Picnic();
		p.captureAPhoto(c);
		p.captureAPhoto(ip);
		p.captureAPhoto(s);

		p.makeAPhoneCall(ip);
		p.makeAPhoneCall(s);
		
		

	}

	public void captureAPhoto(PictureDevice pd) {
		pd.takePicture();
	}

	public void makeAPhoneCall(Phone p) {
		p.makeCall();

	}
}

interface PictureDevice {
	public void takePicture();
}

interface Phone {
	void makeCall();
}

abstract class AbstractPhone implements Phone {
	@Override
	public void makeCall() {
		System.out.println("Pickup device");
		System.out.println("Unlock device");
		dialNumbers();
		System.out.println("Put the phone near your ear");

	}
	
	protected abstract void dialNumbers();

}

class Samsung extends AbstractPhone implements PictureDevice {


	public void dialNumbers() {
		System.out.println("Dial numbers on Samsung");
	}

	@Override
	public void takePicture() {
		System.out.println("Samsung is taking a picture");

	}

}

class Laptop implements Phone {

	@Override
	public void makeCall() {
		// TODO Auto-generated method stub

	}

}

interface InternetBrowser{
	public void browse();

}

class iPhone extends AbstractPhone implements PictureDevice, InternetBrowser {
	
	public void takePicture() {
		System.out.println("iPhone is taking a picture");
	}
	public void browse(){
		System.out.println("Browsing");
	}

	public void dialNumbers() {
		System.out.println("Dial numbers on iPhone");
	}
}

class Camera implements PictureDevice {
	public void takePic() {
		System.out.println("Camera is taking a picture");
	}

	@Override
	public void takePicture() {
		takePic();

	}
}
