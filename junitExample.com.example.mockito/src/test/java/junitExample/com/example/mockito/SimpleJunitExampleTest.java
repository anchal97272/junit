/**
 * 
 */
package junitExample.com.example.mockito;
import junit.framework.TestCase;


/**
 * @author anchalagarwal
 *
 */
public class SimpleJunitExampleTest extends TestCase {
	
	private SimpleJunitExample simpleJunitExample;
	private int num1,num2;
	
	@Override
	protected void setUp() throws Exception
	{
		simpleJunitExample = new SimpleJunitExample();
		num1=20;
		num2=10;
	}
	
	public void testSum()
	{
		assertEquals(30, simpleJunitExample.sum(num1, num2));
	}
	
	public void testSubtract()
	{
		assertEquals(10, simpleJunitExample.subtract(num1, num2));
	}
	public void testProduct()
	{
		assertEquals(200, simpleJunitExample.product(num1, num2));
	}
	
	@Override
	protected void tearDown() throws Exception {
		simpleJunitExample = null;
	}
}
