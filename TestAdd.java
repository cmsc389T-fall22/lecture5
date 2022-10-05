import junit.framework.*;

public class TestAdd extends TestCase {

	public void testAdd(){
		assertTrue(Calculator.add(1, 2) == 3);	
	}
}
