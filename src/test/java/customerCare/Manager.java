package customerCare;

public class Manager {
	boolean isBusy;
	
	public static Manager man = new Manager();
//singleton 
	private Manager() {

	}

	public static Manager getManager() {
		return man;
	}
}
