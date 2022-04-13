package bonus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testGetTotalPay() {
		Employee e = new Employee("Sidharth",20);
		assertEquals(300,e.getTotalPay());
		Employee e1 = new Employee("Sidharth",50);
		assertEquals(765,e1.getTotalPay());
		
		Employee e21 = new Employee("Sidharth",50.5);
		assertEquals(773.25,e21.getTotalPay());
		
		
	}

}
