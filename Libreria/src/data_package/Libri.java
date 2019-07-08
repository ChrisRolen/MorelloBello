package data_package;

public class Libri {
	private String author[];
	private String editor;
	private int year;
	private int ISBN;
	private String genre;
	private int price;
	private String description;
	
	public Libri(String autore[], String casa_editrice, int anno, int ISBN, String genere, int prezzo, String descrizione){
		this.author = autore;
		this.editor = casa_editrice;
		this.year = anno;
		this.ISBN = ISBN;
		this.genre = genere;
		this.price = prezzo;
		this.description = descrizione;
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
			System.out.println("Modifica non disponibile. Selezionare un numero da 1 a 7.");
		}
		
		}
	
	
}
