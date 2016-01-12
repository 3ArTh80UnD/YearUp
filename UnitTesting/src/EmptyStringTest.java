import static org.junit.Assert.*;

import org.junit.Test;

public class EmptyStringTest 
{

	@Test
	public void testEmptyString() 
	{
		EmptyString one = new EmptyString();
		boolean resultOne = one.emptyString("hello");
		assertEquals(resultOne, false);
		
		EmptyString two = new EmptyString();
		boolean resultTwo = two.emptyString("");
		assertEquals(resultTwo, true);
		
		EmptyString three = new EmptyString();
		boolean resultThree = three.emptyString(null);
		assertEquals(resultThree, false);
	}

}
