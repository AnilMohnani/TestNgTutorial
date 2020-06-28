package cricbuzz;

import org.testng.annotations.Test;

public class Team3 {

	@Test
	public void ball() {
		System.out.println("ball");
	}

	@Test
	public void cat() {
		System.out.println("cat");
	}

	@Test(dependsOnMethods = { "cat","zebra" })
	public void anil() {
		System.out.println("anil");
	}
	@Test
	public void zebra() {
		System.out.println("zebra");
	}
	@Test()
	public void elephant() {
		System.out.println("elephant");
	}
	
}
