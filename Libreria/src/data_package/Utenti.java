package data_package;

public class Utenti {
	private String name;
	private String surname;
	private String address;
	private int CAP;
	private String city;
	private int phone_number;
	private String email;
	private String password;
	private int LibroCard;
	
	public Utenti(String name, String surname, String address, int cAP, String city, int phone_number, String email,
			String password, int libroCard) {
		this.name = name;
		this.surname = surname;
		this.address = address;
		CAP = cAP;
		this.city = city;
		this.phone_number = phone_number;
		this.email = email;
		this.password = password;
		LibroCard = libroCard;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getAddress() {
		return address;
	}

	public int getCAP() {
		return CAP;
	}

	public String getCity() {
		return city;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public int getLibroCard() {
		return LibroCard;
	}
	
	
	
}
