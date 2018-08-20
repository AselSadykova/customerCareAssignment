package customerCare;

public class Supervisor {

	public static Supervisor sup = new Supervisor();
	boolean isBusy;

	private Supervisor() {

	}

	public static Supervisor getSupervisor() {
		return sup;
	}
}
