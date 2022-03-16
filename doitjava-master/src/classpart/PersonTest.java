package classpart;

public class PersonTest {

	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.8f;
		personKim.height = 180f;
		
		Person personLee = new Person("이순신", 175, 75); 

	}

}
