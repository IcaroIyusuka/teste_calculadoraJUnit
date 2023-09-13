package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraTeste {

	@SuppressWarnings("deprecation")
	@Test
	public void somadedoisvalores() {
		calculadora calc = new calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(12, soma);
	}
}
