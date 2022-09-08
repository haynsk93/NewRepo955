package jUnit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Testing3 {

	@Test
	public void test6() {
		String expected ="abc";
		String actual="abc";
		System.out.println("Before 1st assert");
		Assert.assertEquals(expected, actual); //We only use hard assert in industries
		System.out.println("After 1st assert");
		Assert.assertTrue("verify 2<3", 2<3);
		System.out.println("After 2nd assert");
	}

}
