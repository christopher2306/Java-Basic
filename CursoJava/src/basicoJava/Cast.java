package basicoJava;

public class Cast {
	public static void main(String[] args) {
		
		//conhecendo Cast
		double salario = 2700.50;
		int valor = (int)salario; //o int entre parentese significa "cast", no qual forçamos ele a transformar um valor decimal em inteiro
		System.out.println("Comparando os valores em double e int \n double: " + salario + "\n int: " + valor);	
	}
}
