package data_package;
import java.util.ArrayList;
import java.util.Comparator;

public class Libri {
	private String author[];
	private String editor;
	private int year;
	private int ISBN;
	private String genre;
	private int price;
	private String description;
	private int numberofsoldcopies;
	
	public Libri(String autore[], String casa_editrice, int anno, int ISBN, String genere, int prezzo, String descrizione, int numberofsoldcopies){
		this.author = autore;
		this.editor = casa_editrice;
		this.year = anno;
		this.ISBN = ISBN;
		this.genre = genere;
		this.price = prezzo;
		this.description = descrizione;
		this.numberofsoldcopies = numberofsoldcopies;
	}
	
	public String[] getAuthor(){
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
	
	public int getPrice(){
		return this.price;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void modify(int choice, Object modif){
		
		switch(choice){
		case 1:
			
			if(modif instanceof String[])
				this.author = (String[]) modif;
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
				return arg0.numberofsoldcopies - arg1.numberofsoldcopies;
			}
			
		});
		
		return classifica;
	}


}

