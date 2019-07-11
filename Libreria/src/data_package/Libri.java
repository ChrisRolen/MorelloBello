package data_package;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Libri extends database {
	private String author;
	private String editor;
	private int year;
	private int ISBN;
	private String genre;
	private float price;
	private String description;
	private int numberofsoldcopies;
	
	public Libri(int ISBN) throws SQLException{
		rs = stmt.executeQuery("SELECT * from libri WHERE ISBN =" + ISBN);
		
		while(rs.next()){
			
		this.author = rs.getString("autori");
		this.editor = rs.getString("casa_editrice");
		this.year = rs.getInt("anno_pubblicazione");
		this.ISBN = ISBN;
		this.genre = rs.getString("genere");
		this.price = rs.getFloat("prezzo");
		this.description = rs.getString("descrizione");
		this.numberofsoldcopies = rs.getInt("copie_vendute");
		
		}
		
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public String getEditor(){
		return this.editor;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getISBN(){
		return this.ISBN;
	}
	
	public String getGenre(){
		return this.genre;
	}
	
	public float getPrice(){
		return this.price;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void modify(int choice, Object modif){
		
		switch(choice){
		case 1:
			
			if(modif instanceof String[])
				this.author = (String) modif;
			break;
			
		case 2:
			if(modif instanceof String)
				this.editor = (String) modif;
			break;
			
		case 3:
			if(modif instanceof Integer)
				this.year = (int) modif;
			break;
			
		case 4:
			if(modif instanceof Integer)
				this.ISBN= (int) modif;
			break;
			
		case 5:
			if(modif instanceof String)
				this.genre = (String) modif;
			break;
			
		case 6:
			if(modif instanceof Integer)
				this.price = (int) modif;
			break;
			
		case 7:
			if(modif instanceof String)
				this.description = (String) modif;
			break;
		
		default:
			throw new NoMemberToModifyException("Il membro selezionato non esiste! Selezionare un numero da 1 a 7");
		}
		
		}
	
	public int getNumberofsoldcopies() {
		return numberofsoldcopies;
	}

	public ArrayList<Libri> classify(Libri... libris){
		ArrayList<Libri> classifica = new ArrayList<Libri>();
		
		for(Libri a:libris){
			classifica.add(a);
		}
		
		classifica.sort(new Comparator<Libri>(){

			@Override
			public int compare(Libri arg0, Libri arg1) {
				return arg0.getNumberofsoldcopies()- arg1.getNumberofsoldcopies();
			}
			
		});
		
		return classifica;
	}
	
	public ArrayList<Libri> classify() throws SQLException{
		ArrayList<Libri> classifica = new ArrayList<Libri>();
		rs = stmt.executeQuery("SELECT * from libri");
		
		while(rs.next()){
			Libri book = new Libri(rs.getInt("IBSN"));
			classifica.add(book);
		}
		
		classifica.sort(new Comparator<Libri>(){

			@Override
			public int compare(Libri arg0, Libri arg1) {
				return arg0.getNumberofsoldcopies()- arg1.getNumberofsoldcopies();
			}
			
		});
		
		return classifica;
	}
}

