import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class PhoneParserTest {
	PhoneParser parser = new PhoneParser();

	@Test
	public void phoneParserTest() {
		Phone phone = parser.parse("TESTMODEL 4.0 1000");
		assertEquals("TESTMODEL", phone.getModel());
		assertEquals(4.0, phone.getScreenSize(), 0.0);
		assertEquals(1000, phone.getBatteryCapacity());
	}

	@Test(expected = IOException.class)
	public void testParseFileIOException() throws IOException {
		parser.parseFile("ThisDoesNotExist.txt");
	}

}
