package prArrayAsoc;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class TestArray {
	@Parameters
    public static Collection<String[]> data() {
        return Arrays.asList(new String[][] {     
                 { "nombre", "Luis" }, { "apellido", "Martin" }, { "dni", "12345567P" }, { "pais", "España" }
           });
    }
    
    private String input;
    private String expected;
    
    public TestArray(String input, String expected){
    	this.input = input;
    	this.expected = expected;
    }
	
    @Test
	public void testSizeVacio() {
		assertEquals(new Integer(0), new ArrayAsoc());
	}

}
