package customerCare;


import java.util.ArrayList;
import java.util.List;

public class CallCenter {

	static Employees emp1 = new Employees(true);
	static Employees emp2 = new Employees(true);
	static Employees emp3 = new Employees(true);

	static List<Employees> listOfEmployees = new ArrayList<Employees>();

	static {
		Supervisor.getSupervisor().isBusy = true;
		Manager.getManager().isBusy = false;
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);

	}

	public static String findCallHandler(List<Employees> listOfEmployees) {
		boolean phoneStatus = true;
		for (Employees employee : listOfEmployees) {
			if (!employee.isBusy) {
				phoneStatus = false;
				return "Employee is answering the phone...";
			}
		}
		if (phoneStatus) {
			if (!Supervisor.getSupervisor().isBusy) {
				phoneStatus = false;
				return "Supervisor is answering the phone...";
			}
		}

		if (phoneStatus) {
			if (!Manager.getManager().isBusy) {
				return "Manager is answering the phone...";
			}
		}
		return "No answer...";
	}

}