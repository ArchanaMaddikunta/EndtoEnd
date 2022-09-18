package PackageTwo;

import org.testng.annotations.Test;

public class ClassNine {
	@Test(groups= {"smoke","functional"})
	public void testNine() {
		System.out.println("testNine");
	}

	@Test(groups= {"Regression"})
	public void testTen() {
		System.out.println("testten");
	}

	

}
