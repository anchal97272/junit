/**
 * 
 */
package junitExample.com.example.mockito;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author anchalagarwal
 *
 */
public class SimpleJunitAnnotationExampleTest {
	
	private static SimpleJunitExample simpleJunitExample;
	private static int num1;
	private static int num2;
	
	
	@BeforeClass
	public static void setUp()
	{
		simpleJunitExample = new SimpleJunitExample();
		num1=20;
		num2=10;
		System.out.println("Test class initialized");
	}
	
	@Before
	public void start()
	{
		System.out.println("Test case start");
	}
	
	@Test
	public void testSum()
	{
		assertEquals(30, simpleJunitExample.sum(num1, num2));
	}
	
	@Test
	public void testSubtract()
	{
		assertEquals(10, simpleJunitExample.subtract(num1, num2));
	}
	@Test
	public void testProduct()
	{
		assertEquals(200, simpleJunitExample.product(num1, num2));
	}
	
	@After
	public void stop()
	{
		System.out.println("Test case end");
	}
	
	@AfterClass
	public static void tearDown() {
		simpleJunitExample = null;
		System.out.println("Test class cleaned");
	}
}
