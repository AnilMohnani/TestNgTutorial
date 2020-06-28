package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demo2 {
@Test
public void test3()
{
	System.out.println("test 3 pass");
}
@BeforeClass
public void beforeClass()
{
	System.out.println("beforeClass");
}

@AfterClass
public void afterClass()
{
	System.out.println("afterClass");
}
@AfterSuite
public void afterSuite()
{
	System.out.println("afterSuite");
}
@BeforeSuite
public void beforeSuite()
{
	System.out.println("beforeSuite");
}
}
