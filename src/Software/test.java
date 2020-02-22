package Software;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class test {

	@Test 
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() { 
int a=10;
int b =10;
Calculator c=new Calculator();


double result=c.sum(a, b);
Assert.assertTrue(result > 0); 
}

}
