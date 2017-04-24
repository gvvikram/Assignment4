package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.LinearSearch;

public class LinearSearchTest {

	LinearSearch ls=null;
	@Before
	public void setUp() throws Exception {
		ls=new LinearSearch();
	}

	@Test
	public void insertion_test() {
		int array[]={2,4,5,65,8,9,45,8,56};
		assertEquals(6,ls.searching(array,9));
	}
	@Test
	public void insertion_nottest() {
		
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals(-1,ls.searching(array,25));
	}
	
}
