package calculadora;
//importação da api para utilização do JUnit.
import org.junit.jupiter.api.Test;
//importação do framework para a funcionalidade do "assert".
import junit.framework.Assert;


public class somaTestJUnit {
	
	@SuppressWarnings("deprecation")//Para importa e deixar funcional o assert.
	@Test//Para importar o JUnit pack, de maneira funcional.
	public void Calculodesoma() {
		
		calculadora calc = new calculadora();//variavel da calculadora para simplificar.
		
		//efetuar o calculo dos numeros inteiros dentro dos colchetes.
		int soma = calc.somar(3,7);//calculo de dois valores.
		
		Assert.assertEquals(10, soma);//o valor colocado junto do comando soma, é para validar o valor, sendo assim o resultado do calculo é 10.
		
		
		
		soma = calc.somar(3,0);//calculo de dois valores sendo um deles igual a zero.
		
		Assert.assertEquals(3, soma);//o valor colocado é o resultado da soma dos dois valores sem assim o valor de 3.
		
		
		
		 soma = calc.somar(0,0);//calculo de dois valores sendo eles igual a zero.
		
		 Assert.assertEquals(0, soma);//o valor colocado é o resultado da soma dos dois valores sem assim o valor de 0.
		
		
		
		 soma = calc.somar(3,-1);//calculo de dois valores sendo um deles negativo.
		
		 Assert.assertEquals(2, soma);//o valor colocado é o resultado da soma dos dois valores sem assim o valor de 2.

		//Nesse teste abaixo esta demonstando uma situação de erro.
		 soma = calc.somar(3,7);//calculo de dois valores.
		
		Assert.assertEquals(9, soma);//o valor colocado junto do comando soma, é para validar, mas o valor esta invalido.
		
	}

}
