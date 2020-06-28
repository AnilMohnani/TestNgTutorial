package cricbuzz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Team1 {

	@Test
	public void team1Login()
	{
		System.out.println("team1Login");
	}
	@Test(groups="INDIA")
	public void team1Score()
	{
		System.out.println("team1Score");
	}
	@Test
	public void team1Logout()
	{
		System.out.println("team1Logout");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest of cricbuzz");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest of cricbuzz");

	}
}
