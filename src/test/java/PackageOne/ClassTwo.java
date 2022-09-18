package PackageOne;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class ClassTwo {
@Test
	public void testFour() {
		System.out.println("testfour");
	}

	@Test
	@AfterSuite
	public void testFive() {
		System.out.println("AfterSuit");
	}

}
