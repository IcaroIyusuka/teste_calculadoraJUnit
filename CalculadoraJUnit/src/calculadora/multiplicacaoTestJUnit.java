package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class multiplicacaoTestJUnit {

	
	
	@SuppressWarnings("deprecation")
	@Test
	public void calculodemuliplicacao() {
		
		calculadora calc = new calculadora();
		
		
		int mult = calc.multiplicacao(8, 7);
		Assert.assertEquals(56, mult);
		
		
		mult = calc.multiplicacao(9, 0);
		Assert.assertEquals(0, mult);
		
		
		mult = calc.multiplicacao(5, 2);
		Assert.assertEquals(10, mult);
		
		
		mult = calc.multiplicacao(8, -7);
		Assert.assertEquals(-56, mult);
	}

}
