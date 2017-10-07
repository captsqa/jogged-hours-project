/**
 * File Name: AppBasicsTest.java<br>
 * Chhaya Patel<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 7, 2017
 */
package com.sqa.cp.helpers;

import org.testng.*;
import org.testng.annotations.*;

/**
 * AppBasicsTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chhaya Patel
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasicsTest {

	@Test()
	public void testRequestBoolean() {
		boolean booleanCharacter = AppBasics.requestBoolean("Do you have a car ? ");
		Assert.assertEquals("y", booleanCharacter);
	}

	@Test
	public void testRequestByte() {
		byte byteNum = AppBasics.requestByte("**Enter a byte string : ");
		Assert.assertEquals(0, byteNum);
	}

	@Test
	public void testRequestChar() {
		char nameChar = AppBasics.requestChar("**Which city you live in ?");
		Assert.assertEquals("s", nameChar);
	}

	@Test
	public void testRequestDouble() {
		double curWallet = AppBasics.requestInt("**How much money you have in yr Wallet ? ");
		Assert.assertEquals(5.0, curWallet, .1);
	}

	@Test
	public void testRequestFloat() {
		float floatNum = AppBasics.requestChar("**What is the value of Pi ?");
		Assert.assertEquals(3.14, floatNum, .1);
	}

	@Test
	public void testRequestInt() {
		int num = AppBasics.requestInt("**Enter integer no : ");
		Assert.assertEquals(10, num);
	}

	@Test
	public void testRequestLong() {
		long longNum = AppBasics.requestLong("**Enter a very long number (10 digits)");
		Assert.assertEquals(1234567890, longNum);
	}

	@Test
	public void testRequestShort() {
		short shortNum = AppBasics.requestShort("**Enter a short number (3 digits)");
		Assert.assertEquals(12, shortNum);
	}

	@Test
	public void testRequestString() {
		String favColor = AppBasics.requestString("**What is your favourite color ?");
		Assert.assertEquals("red", favColor);
	}
}
