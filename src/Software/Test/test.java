package Software.Test;




import org.junit.*;
import Software.java.Calculator;

public class test{
	
	
	

@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() { 
	System.out.println("iam in a test method");
	int a=10;
	int b =10;
	Calculator c=new Calculator();


	double result=c.sum(a, b);
Assert.assertTrue(result>0);
System.out.println("i finished a test method");
	}

	 
 }
