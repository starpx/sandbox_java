package test;

import static org.junit.Assert.*;

import org.junit.Test;
import labs.Kata1;

public class Kata1Test {

	@Test
	public void basicTests() {
	      assertEquals("Vader soid: No, I am your fother!", Kata1.replaceNth("Vader said: No, I am your father!", 2, 'a', 'o'));
	      assertEquals("Vader said: No, I am your fother!", Kata1.replaceNth("Vader said: No, I am your father!", 4, 'a', 'o'));
	      assertEquals("Vader said: No, I am your father!", Kata1.replaceNth("Vader said: No, I am your father!", 6, 'a', 'o'));
	      assertEquals("Vader said: No, I am your father!", Kata1.replaceNth("Vader said: No, I am your father!", 0, 'a', 'o'));
	      assertEquals("Vader said: No, I am your father!", Kata1.replaceNth("Vader said: No, I am your father!", -2, 'a', 'o'));
	      assertEquals("Vader sayd: No, I am your father!", Kata1.replaceNth("Vader said: No, I am your father!", 1, 'i', 'y'));      
	      
	      assertEquals("Luke cries: Noooooioooooioooo!", Kata1.replaceNth("Luke cries: Noooooooooooooooo!", 6, 'o', 'i'));    
	    }

}
