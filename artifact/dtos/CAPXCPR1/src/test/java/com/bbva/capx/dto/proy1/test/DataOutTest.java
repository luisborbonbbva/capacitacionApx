/**
 * 
 */
package com.bbva.capx.dto.proy1.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bbva.capx.dto.proy1.DataOut;

/**
 * @author lborbon
 *
 */
public class DataOutTest {

	DataOut base = new DataOut();

	@Before
	public void starting() {
		base.setDistance("32 km");
		base.setDuration("50 min");
		base.setPrice(14000);
	}

	/**
	 * Method for test the sentence toString() - ended ok
	 */
	@Test
	public void testToString() {
		Assert.assertEquals(base.toString(), "DataOut [distance=32 km, duration=50 min, price=14000]");
	}

	/**
	 * Method for test the sentence toString() - ended fail
	 */
	@Test
	public void testToStringFail() {
		Assert.assertNotSame(base.toString(), "123");
	}

	/**
	 * Method for test the sentence hashCode() - ended ok
	 */
	@Test
	public void testHashCode() {
		int hashCode = base.hashCode();
		Assert.assertEquals(base.hashCode(), hashCode);
	}

	/**
	 * Method for test the sentence hashCode() - ended fail
	 */
	@Test
	public void testHashCodeFail() {
		Assert.assertNotSame(base.hashCode(), 20000);
	}

	/**
	 * Method for test the sentence hashCode() - ended ok
	 */
	@Test
	public void testHashCodeNull() {
		DataOut base2 = new DataOut();
		int hashCode = base2.hashCode();
		Assert.assertEquals(base2.hashCode(), hashCode);
	}

	/**
	 * Method for test the sentence equals() - ended ok
	 */
	@Test
	public void testEquals() {
		Assert.assertEquals(base.equals(base), true);
		Assert.assertEquals(base.equals(null), false);
		Assert.assertEquals(base.equals("32 km"), false);
		DataOut valor2 = new DataOut();
		Assert.assertEquals(valor2.equals(base), false);
		Assert.assertEquals(base.equals(valor2), false);
		valor2.setDistance(null);
		base.setDistance(null);
		Assert.assertEquals(valor2.equals(base), false);
		Assert.assertEquals(base.equals(valor2), false);
		base.setDistance("52 km");
		Assert.assertEquals(valor2.equals(base), false);
		valor2.setDistance("52 km");
		Assert.assertEquals(valor2.equals(base), false);
		valor2.setDistance(base.getDistance());
		Assert.assertEquals(valor2.equals(base), false);
		valor2.setDuration(null);
		base.setDuration(null);
		Assert.assertEquals(valor2.equals(base), false);
		Assert.assertEquals(base.equals(valor2), false);
		base.setDuration("33 min");
		Assert.assertEquals(valor2.equals(base), false);
		valor2.setDuration("52 km");
		Assert.assertEquals(valor2.equals(base), false);
		valor2.setDuration(base.getDuration());
		Assert.assertEquals(valor2.equals(base), false);
		base.setPrice(15000);
		Assert.assertEquals(valor2.equals(base), false);
		valor2.setPrice(base.getPrice());
		Assert.assertEquals(valor2.equals(base), true);
	}
}
