package ponyExpressTest;

import org.junit.Test;

import org.junit.Assert;

import static ponyExpress.PonyExpress.*;

public class PonyExpressTest {

	@Test
	public void caballosTest() {
		
		Assert.assertEquals(1, caballos(new int[] { 18, 15 }));
		Assert.assertEquals(2, caballos(new int[] { 43, 23, 40, 13 }));
		Assert.assertEquals(3, caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
		Assert.assertEquals(3, caballos(new int[] { 51, 51, 51 }));
		Assert.assertEquals(4, caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}
	
	@Test(expected = Error.class)
	public void caballosDistanciasIncorrectasTest() {
		
		caballos(new int[] { -10 , 106 });
		
	}
	

}
