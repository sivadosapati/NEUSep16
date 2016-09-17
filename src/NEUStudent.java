
public class NEUStudent {
	PersonName name;
	int id;
	DateOfBirth dateOfBirth;
	//boolean gender;
	Gender gender;
	Address address;
	float gpa;
	boolean programmingExperience;
	
	void attend(){
		if( gender == Gender.MALE){
			System.out.println("Attend Male career fair");
		}
		if( gender == Gender.FEMALE){
			System.out.println("Attend Female career fair");
		}
	}
	
	String getGPAAsAGrade(){
		if( gpa >=3.5f){
			return "A+";
		}
		if( gpa >=3.0f){
			return "A";
		}
		return "B";
	}
	
	public static void main(String args[]){
		NEUStudent a = new NEUStudent();
		a.gpa = 3.75f;
		System.out.println(a.getGPAAsAGrade());
	}
}

class Address{
	String street1,street2;
	String city;
	String state;
	String postalCode;
}
enum Gender{
	MALE, FEMALE;
}
class PersonName{
	String firstName;
	String lastName;
	String middleName;
}
class DateOfBirth{
	byte birthDay;
	byte monthDay;
	byte yearDay;
}
