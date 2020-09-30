package seProj;

import org.testng.annotations.Test;

public class Demo8 {
	@Test(priority=1)
	public void Bat() {
		System.out.println("Bat");
	}
	
	@Test
	public void Apple() {
		System.out.println("Apple");
	}
	
	@Test(priority=2)
	public void Cat() {
		System.out.println("Cat");
	}	
}
