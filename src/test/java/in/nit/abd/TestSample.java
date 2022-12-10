package in.nit.abd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestSample {
	
	@Test
	@Disabled
	public void testB() {
		Comparable<String> cob = mock(Comparable.class);
		when(cob.compareTo("NIT")).thenReturn(50);
		when(cob.compareTo("ABD")).thenReturn(80);
		assertEquals(50, cob.compareTo("NIT"));
		assertEquals(80, cob.compareTo("ABD"));
	}
	
	
	@Test
	public void testPrintMsg() {
		Sample sob = mock(Sample.class);
		when(sob.printMsg("Abc")).thenReturn("Hello Abc");
		//String  s = sob.printMsg("Hi");
		System.out.println(sob.printMsg("Abc"));
	}
}
