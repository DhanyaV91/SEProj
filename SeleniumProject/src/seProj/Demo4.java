package seProj;

import org.testng.annotations.Test;

public class Demo4 {
	@Test(groups={"Smoke"})
	public void testcase1() {
		System.out.println("This is Smoke TestCase 1!");
	}
	@Test(groups={"Regression"})
	public void testcase2() {
		System.out.println("This is Smoke TestCase 2!");
	}
	@Test(groups={"Smoke"})
	public void testcase3() {
		System.out.println("This is Smoke TestCase 3!");
	}
}
