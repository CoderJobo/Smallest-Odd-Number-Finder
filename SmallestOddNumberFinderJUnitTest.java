/*
 * The following program tests the SmallestOddNumberFinder class using JUnit
 * 
 * @Author: Joan Hickey
 * @Version: 30th April 2020
 */

import org.junit.Assert;
import org.junit.Test;

public class SmallestOddNumberFinderJUnitTest {

	@Test 
	public void findsSmallestOddNumber() {
		int y[] = {2,6,7,9,10,11,4,3,7};
		SmallestOddNumberFinder finder1 = new SmallestOddNumberFinder (y);
		int smallest1 = finder1.getSmallestOddNumber();
		
		Assert.assertEquals(3, smallest1);
	}
}
