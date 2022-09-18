package PackageOne;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassThree {
	@Test
	@BeforeClass
	public void testSix() {
		System.out.println("beforeclass");
	}

	@Test
	@AfterClass
	public void testSeven() {
		System.out.println("Afterclass");
	}

	@Test
	@BeforeTest

	public void testEight() {
		System.out.println("beforeTest");
	}

}
