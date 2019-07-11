package data_package;
import java.util.ArrayList;
import java.util.Comparator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Utenti extends database{
	private String name;
	private String surname;
	private String address;
	private int CAP;
	private String city;
	private int phone_number;
	private String email;
	private String password;
	private int LibroCard;
	
	public Utenti(String email) throws SQLException {
		rs = stmt.executeQuery("SELECT * from utenti WHERE email =" + email);
		while(rs.next()){
		this.name = rs.getString("nome");
		this.surname = rs.getString("cognome");
		this.address = rs.getString("indirizzo");
		CAP = rs.getInt("CAP");
		this.city = rs.getString("citta");
		this.phone_number = rs.getInt("telefono");
		this.email = email;
		this.password = rs.getString("password");
		LibroCard = rs.getInt("libro_card");
		}
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
	
	public boolean isheanadmin(String email, String password) throws SQLException{
		rs = stmt.executeQuery("SELECT * from responsabili WHERE email =" + email + "AND password =" + password);
		return rs.next();
	}
	
}
