import java.util.Locale;
import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		float c;
		int q;
		
		System.out.print("Digite o valor total da conta: ");
		c = scan.nextFloat();
		System.out.println();
		
		System.out.print("Digite a quantidde de pessoas que vao pagar a conta:");
		q = scan.nextInt();
		System.out.println();
		
		Float valor = c/q;
		System.out.println("************************|Quantidade paga por pessoa|************************");
		System.out.println();
		System.out.printf("R$"+valor);
}
}