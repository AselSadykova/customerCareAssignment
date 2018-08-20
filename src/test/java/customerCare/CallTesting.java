package customerCare;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static customerCare.CallCenter.*;

public class CallTesting {

	@Test
	public void testing() {
		String phoneStatus = findCallHandler(listOfEmployees);
		assertEquals(phoneStatus, "Manager is answering the phone...");
	}

}
