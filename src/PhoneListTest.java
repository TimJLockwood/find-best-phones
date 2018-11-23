import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class PhoneListTest {
	PhoneList phonelist = new PhoneList();

	@Test
	public void testAllPhonesEmptyOnStart() {
		assertEquals(0, phonelist.getAllPhones().size());
	}

	@Test
	public void testBestPhonesEmptyOnStart() {
		assertEquals(0, phonelist.getBestPhones().size());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testAllPhonesListUnmodifiable() {
		List<Phone> unmodList = phonelist.getAllPhones();
		unmodList.add(new Phone("test", 1.0, 100));
		assertEquals(0, unmodList.size());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testBestPhonesListUnmodifiable() {
		List<Phone> unmodList = phonelist.getAllPhones();
		unmodList.add(new Phone("test", 1.0, 100));
		assertEquals(0, unmodList.size());
	}
	
	@Test
	public void testAddPhone() {
		phonelist.addPhone(new Phone("Test", 4.0,1000));
		assertEquals(1, phonelist.getAllPhones().size());
		assertEquals(1, phonelist.getBestPhones().size());
	}

}
