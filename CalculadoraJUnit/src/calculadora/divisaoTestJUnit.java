package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class divisaoTestJUnit {

	
	@SuppressWarnings("deprecation")
	@Test
	public void calculodivisao() {
		
		calculadora calc = new calculadora();
		
		
		int div = calc.divisao(4, 2);
		Assert.assertEquals(2, div);
		
		
		div = calc.divisao(1, 2);
		Assert.assertEquals(0, div);
		
		
		div = calc.divisao(2, 2);
		Assert.assertEquals(1, div);
		
		
		div = calc.divisao(0, 2);
		Assert.assertEquals(0 ,div);
	}

}
