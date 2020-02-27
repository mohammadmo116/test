package Software.Test;




import org.junit.*;
import Software.java.Calculator;

public class test{
	
	
	

@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() { 
	int a=10;
	int b =10;
	Calculator c=new Calculator();


	double result=c.sum(a, b);
Assert.assertTrue(result>50);
	}
	 
	 
 }
