import static org.junit.Assert.*;

import org.junit.Test;

public class StringLengthTest 
{

	@Test
	public void testStringLength() 
	{
		StringLength one = new StringLength();
		int resultOne = one.stringLength("hello");
		assertEquals(resultOne, 5);
		
		StringLength two = new StringLength();
		int resultTwo = two.stringLength("Pokemon");
		assertEquals(resultTwo, 7);
		
		StringLength three = new StringLength();
		int resultThree = three.stringLength("Pokem on");
		assertEquals(resultThree, 8);
		
		StringLength four = new StringLength();
		int resultFour = four.stringLength(null);
		assertEquals(resultFour, 0);
	}

}
