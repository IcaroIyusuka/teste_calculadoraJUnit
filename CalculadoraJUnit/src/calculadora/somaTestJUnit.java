package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;


public class somaTestJUnit {

	@SuppressWarnings("deprecation")
	@Test
	public void Calculodesoma() {
		calculadora calc = new calculadora();
		
		int soma = calc.somar(3,7);
		Assert.assertEquals(10, soma);
		
		
		
		soma = calc.somar(3,0);
		Assert.assertEquals(3, soma);
		
		
		
		 soma = calc.somar(0,0);
		 Assert.assertEquals(0, soma);
		
		
		
		 soma = calc.somar(3,-1);
		 Assert.assertEquals(2, soma);
		
	}

}
