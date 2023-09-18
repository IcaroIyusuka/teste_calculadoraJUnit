package calculadora;
//importação da api para utilização do JUnit.
import org.junit.jupiter.api.Test;
//importação do framework para a funcionalidade do "assert".
import junit.framework.Assert;

public class multiplicacaoTestJUnit {

	
	
	@SuppressWarnings("deprecation")
	@Test
	public void calculodemuliplicacao() {
		//variavel da calculadora para simplificar.
		calculadora calc = new calculadora();
		
		//efetuar o calculo dos numeros inteiros dentro dos colchetes.
		//calculo de dois valores.
		int mult = calc.multiplicacao(8, 7);
		//o valor colocado junto do comando mult, é para validar o valor, sendo assim o resultado do calculo acima é 56.
		Assert.assertEquals(56, mult);
		
		//calculo de dois valores sendo um deles igual a zero.
		mult = calc.multiplicacao(9, 0);
		//o valor colocado junto do comando mult, é para validar o valor, sendo assim o resultado do calculo acima é 0.
		Assert.assertEquals(0, mult);
	
		
		//calculo de dois valores sendo um deles igual a 1.
		mult = calc.multiplicacao(5, 1);
		//o valor colocado junto do comando mult, é para validar o valor, sendo assim o resultado do calculo acima é 10.
		Assert.assertEquals(5, mult);
	
		
		//calculo de dois valores sendo um deles negativo.
		mult = calc.multiplicacao(8, -7);
		//o valor colocado junto do comando mult, é para validar o valor, sendo assim o resultado do calculo acima é -56.
		Assert.assertEquals(-56, mult);
	}

}
