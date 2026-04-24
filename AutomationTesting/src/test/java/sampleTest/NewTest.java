package sampleTest;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 2)
  public void sampleProgram() {
	  System.out.println("helo world");
  }
  
  @Test(priority = 1)
  public void sampleTest() {
	  System.out.println("selenium");
  }
}
