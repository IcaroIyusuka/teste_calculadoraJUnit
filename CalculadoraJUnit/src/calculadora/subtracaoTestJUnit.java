package calculadora;

//importação da api para utilização do JUnit.
import org.junit.jupiter.api.Test;
//importação do framework para a funcionalidade do "assert".
import junit.framework.Assert;


public class subtracaoTestJUnit {
	
	
	@SuppressWarnings("deprecation")//Para importa e deixar funcional o assert.
	@Test//Para importar o JUnit pack, de maneira funcional.
	
	public void Calculodesubtracao() {
		//Criando uma instacia da calculadora, para simplificar.
		calculadora calc = new calculadora();


		//efetuar o calculo dos numeros inteiros dentro dos colchetes.
		
		int sub = calc.subtracao(7,3);//calculo de dois valores.
		
		Assert.assertEquals(4, sub);//o valor colocado junto do comando sub, é para validar o valor, sendo assim o resultado do calculo acima é 4.
		
		
		sub = calc.subtracao(2, 0);//calculo de dois valores sendo um deles igual a zero.
		
		Assert.assertEquals(2, sub);//o valor colocado junto do comando sub, é para validar o valor, sendo assim o resultado do calculo acima é 2.
		
		
		
		sub = calc.subtracao(3, 3);//Calculo de dois valores sendo os dois valores iguais.
		
		Assert.assertEquals(0, sub);//o valor colocado junto do comando sub, é para validar o valor, sendo assim o resultado do calculo acima é 0.
		
		
		sub = calc.subtracao(5, -5);//Calculo de dois valores sendo um dos valores negativo.
		
		Assert.assertEquals(10, sub);//o valor colocado junto do comando sub, é para validar o valor, sendo assim o resultado do calculo acima é 10.

		//Nesse teste abaixo esta demonstando uma situação de erro.
		 sub= calc.subtracao(3,7);//calculo de dois valores.
		
		Assert.assertEquals(12, sub);//o valor colocado junto do comando soma, é para validar, mas o valor esta invalido.
		

	}

}
