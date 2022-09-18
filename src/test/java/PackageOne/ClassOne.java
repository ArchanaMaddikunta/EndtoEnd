package PackageOne;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ClassOne {
	@Test(priority=-1,enabled=false)
	@Parameters({ "url", "platform" })

	public void testOne( int url, int platform) {
		System.out.println("the url is" + url);
		System.out.println("The platform is" + platform);
	}
	@Ignore
	@Test(priority=0)
	public void testTwo() {
		System.out.println("testtwo");
	}

	 
	@Test(priority=1)
	public void testThree() {
		System.out.println("testhree");
	}

}
