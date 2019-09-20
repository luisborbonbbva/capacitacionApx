package com.bbva.capx.dto.proy1.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bbva.capx.dto.proy1.DataInt;

public class DataIntTest {


	DataInt base = new DataInt();

	@Before
	public void starting() {
		base.setDestination("Funza");;
		base.setOrigin("Bogota");
	}

	/**
	 * Method for test the sentence toString() - ended ok
	 */
	@Test
	public void testToString() {
		Assert.assertEquals(base.toString(), "DataInt [origin=Bogota, destination=Funza]");
	}

	/**
	 * Method for test the sentence toString() - ended fail
	 */
	@Test
	public void testToStringFail() {
		Assert.assertNotSame(base.toString(), "Funza");
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
		DataInt base2 = new DataInt();
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
		Assert.assertEquals(base.equals("Bogota"), false);
		DataInt valor2 = new DataInt();
		Assert.assertEquals(valor2.equals(base), false);
		Assert.assertEquals(base.equals(valor2), false);
		valor2.setOrigin(null);
		base.setOrigin(null);
		Assert.assertEquals(valor2.equals(base), false);
		Assert.assertEquals(base.equals(valor2), false);
		base.setOrigin("Chia");
		Assert.assertEquals(valor2.equals(base), false);
		valor2.setOrigin("Ubate");
		Assert.assertEquals(valor2.equals(base), false);
		valor2.setOrigin(base.getOrigin());
		Assert.assertEquals(valor2.equals(base), false);
		valor2.setDestination(null);
		base.setDestination(null);
		Assert.assertEquals(valor2.equals(base), true);
		Assert.assertEquals(base.equals(valor2), true);
		base.setDestination("Chia");
		Assert.assertEquals(valor2.equals(base), false);
		valor2.setDestination("Ubate");
		Assert.assertEquals(valor2.equals(base), false);
		valor2.setDestination(base.getDestination());
		Assert.assertEquals(valor2.equals(base), true);
		valor2.setOrigin(null);
		base.setOrigin("Cajica");		
		
	}

	
	
	
}
