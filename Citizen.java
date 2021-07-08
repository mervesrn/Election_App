import java.util.Random;

public class Citizen {

	private String name;
	private String address;
	private int age;
	
	public static String[] generatedNames = {
			"Leon Mcdonald",
			"Frankie Johnson",
			"Todd Rosenthal",
			"Mauricio Curran",
			"Randy Feinstein",
			"Donald Munoz",
			"Bonnie Barnhardt",
			"Gary Foley",
			"Brittney Wilson",
			"Lyndsay Loomis",
			"Madge Cartwright",
			"Stella Coan",
			"David Lafave",
			"Kimberly Matthews",
			"Dwayne Heckler",
			"Laura Payne",
			"Mary Luevano",
			"Walter Sizemore",
			"James Lawson",
			"Pat Nelson",
			"Sherry Leighton",
			"Anthony Tieman",
			"Lona Davis",
			"Ana Flores",
			"Richard Mcdonald",
			"Joseph Standley",
			"Nancy Eddy",
			"Joyce Shaw",
			"Philip Collings",
			"James Reay",
			"Barbara Acker",
			"Violet Cleary",
			"Maria Crawley",
			"Erin Hilton",
			"Evelyn Morales",
			"Leo Rose",
			"Dorothy Johnson",
			"Geoffrey Fogarty",
			"Jane Marin",
			"Daniel Tran",
			"Nancy Lee",
			"Peter Johnson",
			"Glenn Browning",
			"Mark Jaramillo",
			"Latina Gross",
			"Theresa Stutes",
			"George Thiel",
			"Robert Carney",
			"Janet Watts",
			"Michael English",
			"James Scott",
			"Elmer Honaker",
			"Brian Upton",
			"Dawne Miller",
			"Gretchen Bender",
			"John Carr",
			"Faith Gavin",
			"Traci Hill",
			"Joseph Miller",
			"Don Montoya",
			"Brandy Pritts",
			"Sandra Sheppard",
			"Charles Whitmer",
			"Ana Williams",
			"Elizabeth Murphy",
			"Michael Hollingsworth",
			"Claudine Dalton",
			"Harold Coleman",
			"Young Ayala",
			"Shelba Kirschbaum",
			"Tom Perez",
			"Amee Martin",
			"Maryanne Foote",
			"Sylvia Harrell",
			"Alexander Weibel",
			"Bruce Bailey",
			"Vincent Fidler",
			"Jack Wilbur",
			"Charles Pond",
			"Danielle Yocom",
			"John Kemp",
			"Jamie Casey",
			"Everett Frederick",
			"Emma Hazley",
			"Justin Lynch",
			"Tyler Miller",
			"Albert Reyes",
			"Wilbur Price",
			"Kimberly Halton",
			"Mary Underwood",
			"Raymond Garrett",
			"William Olive",
			"Joanne Smith",
			"Wilbert Howerton",
			"Selene Gross",
			"Jennie Andrews",
			"Jasper Barrows",
			"Robert Verdin",
			"Mark Mcallister",
			"Teri Morrissey"
		};
	
	public static String[] generatedAdress = {
			"Greendale",
			"Naperville",
			"Oshkosh",
			"Indianapolis",
			"Rockford",
			"Minnesota",
			"Mississipi",
			"Alabama",
			"Ontario",
			"Iowa",
			"Toronto",
			"Ohio",
			"Kentucky",
			"Arkansas",
			"Florida",
			"Dallas",
			"Illinois",
			"West Allis",
			"York Ville",
			"New Berlin",
			"Wind Lake",
			
		};


	public Citizen() {
		Random rand = new Random(); 
		int rand_int1 = rand.nextInt(this.generatedNames.length); 
		this.setName(this.generatedNames[rand_int1]);
		
		Random random = new Random(); 
		int rand_int2 = random.nextInt(100); 
		this.setAge(rand_int2);
		
		Random rand2 = new Random(); 
		int rand_int3 = rand2.nextInt(this.generatedAdress.length); 
		this.setAddress(this.generatedAdress[rand_int3]);
	}
	
	
	public Citizen(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	



	public String toString() {
		return "[name=" + name + ", address=" + address + ", age=" + age + "]";
	}


	public int votesFor(int numberofcandidates) {
		Random random=new Random();
		int rand_int1 = random.nextInt(numberofcandidates); 
		return rand_int1;
	}
	
	
}
