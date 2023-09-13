package calculadora;


import org.junit.jupiter.api.Test;

import junit.framework.Assert;


public class subtracaoTestJUnit {
	
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void Calculodesubtracao() {
		calculadora calc = new calculadora();
		
		int sub = calc.subtracao(7,3);
		Assert.assertEquals(4, sub);
		
		
		sub = calc.subtracao(2, 0);
		Assert.assertEquals(2, sub);
		
		
	
		sub = calc.subtracao(3, 3);
		Assert.assertEquals(0, sub);
		
		
		sub = calc.subtracao(5, -5);
		Assert.assertEquals(10, sub);
		
		

	}

}
