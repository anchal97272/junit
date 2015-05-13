package junitExample.com.example.powerMockito;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.verifyPrivate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

//@RunWith(MockitoJUnitRunner.class)
@RunWith(PowerMockRunner.class)
@PrepareForTest(PowerMockingExample.class)
public class PowerMockingExampleTest {
	
	private PowerMockingExample thePowerMockingExample;
	
	@Before
	public void setup()
	{
		//MockitoAnnotations.initMocks(this);
		//mockStatic(Math.class);
		thePowerMockingExample = PowerMockito.spy(new PowerMockingExample());
	}
	
	@Test
	public void testStatic() throws Exception{
		//when(Math.max(2, 5)).thenReturn(2);
		PowerMockito.doReturn(2).when(thePowerMockingExample, "addNumber",2,5);
		assertEquals(2,thePowerMockingExample.add(2, 5));
		verifyPrivate(thePowerMockingExample).invoke("addNumber", 2,5);
	}

}
