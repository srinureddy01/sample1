package sampe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class apptest {
	
	@Test
	public void testlogin1()
	{
		app myapp=new app();
		Assert.assertEquals(0,myapp.userLogin("cse","cse@2024"));
	}
	
	@Test
	public void testlogin2()
	{
		app myapp=new app();
		Assert.assertEquals(0,myapp.userLogin("cse","cse@2024"));
	}

}
