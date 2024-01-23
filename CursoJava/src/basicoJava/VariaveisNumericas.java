package basicoJava;

public class VariaveisNumericas {
	public static void main(String[] args) {
		
		//var int
		int idade;
		idade = 13;
		
		//imprimindo a variavel que foi criada e recebeu um valor
		System.out.println("A idade é igual a " + idade + ".");	
		
		//multiplicando o valor da variavel por 10
		System.out.println("Ao multiplicar a idade por 10, o resultado é: " + idade * 10);
		
		//somando uma variavel a outra
		int idade2 = 20;
		System.out.println("A soma das idades é: " + (idade + idade2));
		
		
		//var double
		double peso = 30.5;
		System.out.println("O peso informado é: " + peso);
		
		//dividindo o valor da variavel por 2
		double calculoPeso = 30.5 / 2;
		System.out.println("O peso dividido por 2 é igual: " + calculoPeso);
		
		
		//forcando erro de divisao com int
		int valor1 = 3;
		int valor2 = 2;
		int div = valor1 / valor2;
		System.out.println("O valor 1 dividido pelo valor 2 é: " + div);
		
		//comparando com divisao em double
		double v1 = 3.0;
		double v2 = 2.0;
		double resultado = (v1 / v2);
		System.out.println("O valor 1 dividido pelo valor 2 é: " + resultado);
	}
}
