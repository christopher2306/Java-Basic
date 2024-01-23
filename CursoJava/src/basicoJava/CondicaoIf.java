package basicoJava;

public class CondicaoIf {
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais.");
		
		//teste 1
		int idade = 18;
		boolean maiorAcompanhando = false;
		
		if (idade >= 18) {
			System.out.println("Venda de bebidas liberada! O usuário é adulto.");
		} else if (idade < 18 && maiorAcompanhando == true){
			System.out.println("Venda de bebidas liberada! O usuário está acompanhado de um responsável adulto.");
		} else {
			System.out.println("Venda de bebidas negada!");
		}
		
		
		
		//teste 2
		int idade2 = 17;
		boolean maiorAcompanhando2 = true;
				
		if (idade2 >= 18) {
			System.out.println("Venda de bebidas liberada! O usuário é adulto.");
		} else if (idade2 < 18 && maiorAcompanhando2 == true){
			System.out.println("Venda de bebidas liberada! O usuário está acompanhado de um responsável adulto.");
		} else {
			System.out.println("Venda de bebidas negada!");
		}
		
		
		
		//teste 3
		int idade3 = 17;
		boolean maiorAcompanhando3 = false;
						
		if (idade3 >= 18) {
			System.out.println("Venda de bebidas liberada! O usuário é adulto.");
		} else if (idade3 < 18 && maiorAcompanhando3 == true){
			System.out.println("Venda de bebidas liberada! O usuário está acompanhado de um responsável adulto.");
		} else {
			System.out.println("Venda de bebidas negada!");
		}
		
	}
}
