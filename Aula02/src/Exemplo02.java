import java.util.Locale;
import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		float n1, n2;
		
		System.out.println("Digite o 1º");
		n1 = scan.nextFloat();
		
		System.out.println("Digite o 2º");
		n2 = scan.nextFloat();
		
		float soma = n1+n2;
		
		System.out.println();
		
		float subtracao = n1-n2;
		float multiplicacao = n1*n2;
		
		
		//Maneira diferentes de formatar
		
		System.out.println("A soma dos valores = "+String.format("%.2f",soma));
		
		System.out.println(String.format("A subtracao dos valores = %.2f",subtracao));
		
		System.out.println(String.format("%s = %.2f","A multiplicacao dos valores ",multiplicacao));
		
		float divisao ;
		//float resto;
		
		if( n2> 0){
				
			divisao = n1/n2;
			//resto = n1%n2;
		
			System.out.println("A divisao dos valores = "+divisao);
			//System.out.println("A resto da divisao dos valores = "+divisao+ "\ne resto sera "+resto);
		
		} else {
			System.out.println("Não e possivel dividir por zero");
		}
		
		scan.close();
		}

}
