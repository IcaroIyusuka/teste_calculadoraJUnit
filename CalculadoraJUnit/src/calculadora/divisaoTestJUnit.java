package calculadora;
//importação da api para utilização do JUnit.
import org.junit.jupiter.api.Test;
//importação do framework para a funcionalidade do "assert".
import junit.framework.Assert;

public class divisaoTestJUnit {

	
	@SuppressWarnings("deprecation")//Para importa e deixar funcional o assert
	
	@Test//Para importar o JUnit pack, de maneira funcional.
	public void calculodivisao() {
		//Simplificar a instacia da calculadora.
		calculadora calc = new calculadora();
		
		//efetuar o calculo dos numeros inteiros dentro dos colchetes.
		int div = calc.divisao(4, 2);//Calculando a divisao de dois valroes.
		
		Assert.assertEquals(2, div);//o valor colocado junto do comando div, é para validar o valor, sendo assim o resultado do calculo acima é 2.
		
		
		div = calc.divisao(1, 2);//Calculando a divisão de dois valores, sendo o dividendo menor que o divisor.
		
		Assert.assertEquals(0, div);//o valor colocado junto do comando div, é para validar o valor, sendo assim o resultado do calculo acima é 0.
		
		
		div = calc.divisao(2, 2);//Calculando a divisão de dois valores iguais
		
		Assert.assertEquals(1, div);//o valor colocado junto do comando div, é para validar o valor, sendo assim o resultado do calculo acima é 1.
		
		
		div = calc.divisao(0, 2);//Calculando a divisão de dois valores, sendo o dividendo igual a zero.
		
		Assert.assertEquals(0 ,div);//o valor colocado junto do comando div, é para validar o valor, sendo assim o resultado do calculo acima é 0.

		//No teste abaixo esta demonstrando uma situação de erro.
		int div = calc.divisao(4, 2);//Calculando a divisao de dois valroes.
		
		Assert.assertEquals(3, div);//o valor colocado junto do comando div, é para validar o valor, sendo assim o valor esta invalido.
	}

}
