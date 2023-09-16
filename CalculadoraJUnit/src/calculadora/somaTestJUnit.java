package calculadora;
//importação da api para utilização do JUnit.
import org.junit.jupiter.api.Test;
//importação do framework para a funcionalidade do "assert".
import junit.framework.Assert;


public class somaTestJUnit {
	
	@SuppressWarnings("deprecation")
	@Test
	public void Calculodesoma() {
		//variavel da calculadora para simplificar.
		calculadora calc = new calculadora();
		//efetuar o calculo dos numeros inteiros dentro dos colchetes.
		//calculo de dois valores.
		int soma = calc.somar(3,7);
		//o valor colocado junto do comando soma, é para validar o valor, sendo assim o resultado do calculo acima é 10.
		Assert.assertEquals(10, soma);
		
		
		//calculo de dois valores sendo um deles igual a zero.
		soma = calc.somar(3,0);
		//o valor colocado é o resultado 
		Assert.assertEquals(3, soma);
		
		
		
		 soma = calc.somar(0,0);
		 Assert.assertEquals(0, soma);
		
		
		
		 soma = calc.somar(3,-1);
		 Assert.assertEquals(2, soma);
		
	}

}