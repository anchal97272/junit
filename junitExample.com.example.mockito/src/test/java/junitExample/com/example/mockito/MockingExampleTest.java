/**
 * 
 */
package junitExample.com.example.mockito;

import static org.mockito.Matchers.anyString;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author anchalagarwal
 *
 */
public class MockingExampleTest {
	private List<String> theList;
	
	@Before
	public void setUp()
	{
		theList=mock(List.class);
	}
	@Test
	public void testMock()
	{
		theList.add("anchal");
		verify(theList).add("anchal");
		
		//Verify with argument matcher
		verify(theList).add(anyString());
	}
	
	@Test
	public void testMockStubbing()
	{
		when(theList.get(0)).thenReturn("anchal");
		System.out.println(theList.get(0));
		System.out.println(theList.get(1));
	}
	
	@Test
	public void testMockVerifyNumberOfTimes()
	{
		theList.clear();
		verify(theList, times(1)).clear();// equivalent to verify(theList).clear();
		
		theList.add("anchal");
		theList.add("anchal");
		
		verify(theList, times(2)).add("anchal");
		verify(theList, never()).add("agarwal");
		
		verify(theList, atLeastOnce()).add("anchal");
		verify(theList, atMost(2)).add("anchal");
	}

	@Test
	public void testSpy()
	{
		List<String> theSpyList = spy(new LinkedList<String>());
		//ßwhen(theSpyList.get(0)).thenReturn("anchal");// throw exception as it calls real method
		doReturn("anchal").when(theSpyList).get(0);
		System.out.println(theSpyList.get(0));
	}
	@After
	public void tearDown()
	{
		theList=null;
	}
}
