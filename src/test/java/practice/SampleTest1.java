package practice;

import org.testng.annotations.Test;

public class SampleTest1 {

	@Test(groups = "smoke")
	public void createContact()
	{
		System.out.println("contact created");
		
	}
	@Test(groups ="smoke")
	public void modifyContact()
	{
		System.out.println("contact modified");
	}
}
