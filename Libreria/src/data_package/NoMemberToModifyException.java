package data_package;

public class NoMemberToModifyException extends IllegalArgumentException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoMemberToModifyException(String error_string){
		super(error_string);
	}
	
}
