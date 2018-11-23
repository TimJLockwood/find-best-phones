import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PhoneTest {
	Phone phone = new Phone("Samsung Note 4", 4.0, 1900);

	@Test
	public void TestGetModel() {
		assertEquals("Samsung Note 4", phone.getModel());
	}

	@Test
	public void testGetCapacity() {
		assertEquals(1900, phone.getBatteryCapacity());
	}

	@Test
	public void testGetScreenSize() {
		assertEquals(4.0, phone.getScreenSize(), 0.0);
	}

	@Test
	public void testDoesDominate() {
		Phone betterPhone = new Phone("Bigger Better Phone", 10.0, 2900);
		assertTrue(betterPhone.dominates(phone));
	}

	@Test
	public void testDoesntDominate() {
		Phone betterPhone = new Phone("Bigger Better Phone", 10.0, 2900);
		assertFalse(phone.dominates(betterPhone));
	}

	@Test
	public void testPartiallyDominates() {
		Phone betterPhone = new Phone("Bigger Better Phone", 1.0, 2900);
		assertFalse(phone.dominates(betterPhone));
	}

}
