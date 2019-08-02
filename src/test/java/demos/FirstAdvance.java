package demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstAdvance {
	 @Test
	  public void f1() {
		  System.out.println("at test1");
	  }
	 @Test
	  public void f2() {
		  System.out.println("at test2");
	  }
  @Test
  public void f3() {
	  System.out.println("at test3");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("b4class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");   

  }

}
