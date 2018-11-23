import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;


class PhoneListTest {
	PhoneList phonelist = new PhoneList();
			
	@Test
	void testAllPhonesEmptyOnStart() {
		assertEquals(0,phonelist.getAllPhones().size());
	}
	
	@Test
	void testBestPhonesEmptyOnStart() {
		assertEquals(0,phonelist.getBestPhones().size());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	void testAllPhonesListUnmodifiable() {
		List<Phone> unmodList = phonelist.getAllPhones();
		unmodList.add(new Phone("test",1.0,100));
		assertEquals(0,unmodList.size());
	}

}
