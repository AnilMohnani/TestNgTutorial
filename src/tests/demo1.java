package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo1 {
@Test
public void test1()
{
	System.out.println("test 1 pass");
}
@Test(groups="INDIA")
public void test2()
{
	System.out.println("test 2 pass");
}
@BeforeTest
public void bf()
{
	System.out.println("bf");
}
}
