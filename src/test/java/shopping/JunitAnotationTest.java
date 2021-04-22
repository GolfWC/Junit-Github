package shopping;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnotationTest {
	
	@Test
	public void becomeTester() {
		System.out.println("Test1");
		
	}
	
	@Ignore
	@Test
	public void Tester() {
		System.out.println("Test2");
		
	}
	
	@Test
	public void devoloper() {
		
		System.out.println("Test3");
		
	}
	
	@Before
	public void beforeTest() {
		
		System.out.println("-----Before-----");
	}
	
	@After
	public void afterTest() {
		
		System.out.println("-------After-------");
	}
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("----------------------------");
		System.out.println("---------BeforeClass--------");
		
	}
	@AfterClass
	public static void afterClass() {
		
		System.out.println("----------------------------");
		System.out.println("---------afterClass--------");
		
	}

}
