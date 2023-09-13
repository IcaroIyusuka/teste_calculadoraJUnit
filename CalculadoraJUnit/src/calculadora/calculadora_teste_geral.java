package calculadora;

public class calculadora_teste_geral {

	public static void main(String[] args) {
		calculadora calc = new calculadora();
		
		System.out.println("Area do teste de soma");
		
		
		//cenario de teste 1 : Soma de dois valores.
				int soma = calc.somar(3,7);
				System.out.println(soma);
				
				//cenario de teste 2: Soma de dois valores sendo que um deles zero.
				 soma = calc.somar(3,0);
				System.out.println(soma);
				
				//cenario de teste 3: Soma de dois valores sendo ambos zero.
				 soma = calc.somar(0,0);
				System.out.println(soma);
				
				//cenario de teste 4: Soma de dois valores sendo um deles negativo.
				 soma = calc.somar(3,-1);
				System.out.println(soma);
		
		
		
		System.out.println("------------------------------------------------------------------");
		
		
		System.out.println("Area do teste de Subtração");
		
		
		//cenario de teste 1: Subtração de dois valores.
				int sub = calc.subtracao(7,3);
				System.out.println(sub);
				
				
				//cenario de teste 2: Subtração de dois valores sendo um deles igual a zero.
				sub = calc.subtracao(2, 0);
				System.out.println(sub);
				
				
				//cenario de teste 3: Subtração de dois numeros iguais.
				sub = calc.subtracao(3, 3);
				System.out.println(sub);
				
				
				//cenario de teste 4: Subtração de dois valores sendo um deles negativo
				sub = calc.subtracao(5, -5);
				System.out.println(sub);
		
		
		System.out.println("------------------------------------------------------------------");
		
		
		System.out.println("Area do teste de multiplicação");
		
		//cenario de teste 1: Multiplicação de dois valores.
				double mult = calc.multiplicacao(8, 7);
				System.out.println(mult);
				
				//cenario de teste 2: Multiplicação de dois valores sendo que um deles igual a zero.
				mult = calc.multiplicacao(9, 0);
				System.out.println(mult);
				
				//cenario de teste 3: Multiplicação de dois numeros sendo os dois com virgula.
				mult = calc.multiplicacao(5.5, 2.5);
				System.out.println(mult);
				
				//cenario de teste 4: Multiplicação de dois valores sendo um deles negativo.
				mult = calc.multiplicacao(8, -7);
				System.out.println(mult);
		
System.out.println("------------------------------------------------------------------");
		
		
		System.out.println("Area do teste de Divisão");
		
		//cenario de teste 1:Divisão de dois valores.
				double div = calc.divisao(4, 2);
				System.out.println(div);
				
				//cenario de teste 2: Divisão de dois valores sendo o dividendo menor que o divisor.
				div = calc.divisao(1, 2);
				System.out.println(div);
				
				//cenario de teste 3: Divisão de dois valroes iguais.
				div = calc.divisao(2, 2);
				System.out.println(div);
				
				//cenario de teste 4: Divisão de dois valores sendo o dividendo igual a zero.
				div = calc.divisao(0, 2);
				System.out.println(div);
	}

}
