package seProj;

import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void dhanya() {
		System.out.println("Welcome Dhanya!");
	}
	@Test(timeOut=2000)
	public void aditya() throws InterruptedException {
		Thread.sleep(1999);
		System.out.println("Welcome Aditya!");
	}
	@Test(enabled=false)
	public void catherine() {
		System.out.println("Welcome Catherine!");
	}
	@Test
	public void bindu() {
		System.out.println("Welcome Bindu!");
	}
}
