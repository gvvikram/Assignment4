package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.BinarySearch;
public class BinarySearchTest {

	BinarySearch binerySearching=null;
	@Before
	public void setUp() throws Exception {
		binerySearching=new BinarySearch();
	}

	@Test
	public void binerySearching_test() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals(9,binerySearching.searching(array,15));
	}
	@Test
	public void binerySearching_nottest() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals(-1,binerySearching.searching(array,25));
	}
}

