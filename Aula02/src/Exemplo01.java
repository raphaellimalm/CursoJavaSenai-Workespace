import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		int n1, n2;
		
		System.out.println("Digite 1 numero");
		n1 = scan.nextInt();
		
		System.out.println("Digite 1 numero");
		n2 = scan.nextInt();
		int soma = n1+n2;
		System.out.println();
		System.out.println("A soma dos valores = "+soma);
		int subtracao = n1-n2;
		System.out.println("A subtracao dos valores = "+subtracao);
		int multiplicacao = n1*n2;
		System.out.println("A multiplicacao dos valores = "+multiplicacao);
		int divisao = n1/n2;
		System.out.println("A divisao dos valores = "+divisao);
		int resto = n1%n2;
		System.out.println("A divisao dos valores = "+divisao+ " resto sera "+resto);
		
		scan.close();
	}

}
