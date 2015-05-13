/**
 * 
 */
package junitExample.com.example.powerMockito;

/**
 * @author anchalagarwal
 *
 */
public class PowerMockingExample {

	public int add(int num1, int num2)
	{
		return addNumber(num1, num2);
	}
	
	private int addNumber(int num1, int num2)
	{
		return num1+num2;
	}
	public int max(int num1, int num2)
	{
		return Math.max(num1, num2);
	}
}
