import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

class PhoneTest {
	Phone phone = new Phone("Samsung Note 4",4.0,1900);

	@Test
	void TestGetModel() {
		assertEquals("Samsung Note 4", phone.getModel());
	}
	
	@Test
	void testGetCapacity() {
		assertEquals(1900, phone.getBatteryCapacity());
	}
	@Test
	void testGetScreenSize() {
		assertEquals(4.0, phone.getScreenSize(), 0.0);
	}
	
	@Test
	void testDoesDominate() {
		Phone betterPhone = new Phone("Bigger Better Phone",10.0,2900);
		assertTrue(betterPhone.dominates(phone));
	}
	@Test
	void testDoesntDominate() {
		Phone betterPhone = new Phone("Bigger Better Phone",10.0,2900);
		assertFalse(phone.dominates(betterPhone));
	}
	
	@Test
	void testPartiallyDominates() {
		Phone betterPhone = new Phone("Bigger Better Phone",1.0,2900);
		assertFalse(phone.dominates(betterPhone));
	}

}
