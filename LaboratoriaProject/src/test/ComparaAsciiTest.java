package test;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import labs.ComparaAscii;


public class ComparaAsciiTest {

	@Test
	 public void BasicTests() {
	        assertEquals(true, ComparaAscii.compare("zz1", ""));
	        assertEquals(true, ComparaAscii.compare("ZzZz", "ffPFF"));
	        assertEquals(true, ComparaAscii.compare(null, ""));
	    }

}

