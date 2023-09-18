package calculadora;

//importação da api para utilização do JUnit.
import org.junit.jupiter.api.Test;
//importação do framework para a funcionalidade do "assert".
import junit.framework.Assert;


public class subtracaoTestJUnit {
	
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void Calculodesubtracao() {
		//variavel da calculadora para simplificar.
		calculadora calc = new calculadora();


		//efetuar o calculo dos numeros inteiros dentro dos colchetes.
		//calculo de dois valores.
		int sub = calc.subtracao(7,3);
		//o valor colocado junto do comando subtração, é para validar o valor, sendo assim o resultado do calculo acima é 4.
		Assert.assertEquals(4, sub);
		
		//calculo de dois valores sendo um deles igual a zero.
		sub = calc.subtracao(2, 0);
		//o valor colocado é o resultado da subtração dos dois valores sem assim o valor de 3.
		Assert.assertEquals(2, sub);
		
		
		//Calculo de dois valores sendo os dois valores iguais.
		sub = calc.subtracao(3, 3);
		//o valor colocado é o resultado da subtração dos dois valores sem assim o valor de 0.
		Assert.assertEquals(0, sub);
		
		//Calculo de dois valores sendo um dos valores negativo.
		sub = calc.subtracao(5, -5);
		//o valor colocado é o resultado da subtração sendo igual a 10.
		Assert.assertEquals(10, sub);
		
		

	}

}
