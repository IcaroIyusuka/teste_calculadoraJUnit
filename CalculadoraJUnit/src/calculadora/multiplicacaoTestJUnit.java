package calculadora;
//importação da api para utilização do JUnit.
import org.junit.jupiter.api.Test;
//importação do framework para a funcionalidade do "assert".
import junit.framework.Assert;

public class multiplicacaoTestJUnit {

	
	
	@SuppressWarnings("deprecation")//Para importa e deixar funcional o assert.
	@Test//Para importar o JUnit pack, de maneira funcional.
	public void calculodemuliplicacao() {
		//Simplificar a instacia da calculadora.
		calculadora calc = new calculadora();
		
		//efetuar o calculo dos numeros inteiros dentro dos colchetes.
		
		int mult = calc.multiplicacao(8, 7);//calculo da multiplicação de dois valores.
		
		Assert.assertEquals(56, mult);//o valor colocado junto do comando mult, é para validar o valor, sendo assim o resultado do calculo é 56.
		
		
		mult = calc.multiplicacao(9, 0);//calculo da multiplicação de dois valores sendo um deles igual a zero.
		
		Assert.assertEquals(0, mult);//o valor colocado junto do comando mult, é para validar o valor, sendo assim o resultado do calculo é 0.
	
		
		
		mult = calc.multiplicacao(5, 1);//calculo da multiplicação de dois valores sendo um deles igual a 1.
		
		Assert.assertEquals(5, mult);//o valor colocado junto do comando mult, é para validar o valor, sendo assim o resultado do calculo é 10.
	
		
		mult = calc.multiplicacao(8, -7);//calculo da multiplicação de dois valores sendo um deles negativo.
		
		Assert.assertEquals(-56, mult);//o valor colocado junto do comando mult, é para validar o valor, sendo assim o resultado do calculo é -56.

		//O teste abaixo é para um valor invalido
		mult = calc.multiplicacao(8, 7);//calculo da multiplicação de dois valores.
		
		Assert.assertEquals(54, mult);//o valor colocado junto do comando mult, é para validar o valor, mas esse valor esta invalido nessa execução.
		
	}

}
