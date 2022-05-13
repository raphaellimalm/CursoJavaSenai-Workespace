import java.util.Locale;
import java.util.Scanner;

public class Exemplo03{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		int n1, n2, n3;
		
		System.out.print("Digite o 1º numero: ");
		n1 = scan.nextInt();
		System.out.println();
		
		System.out.print("Digite o 2º numero: ");
		n2 = scan.nextInt();
		System.out.println();
		
		System.out.print("Digite o 3º numero: ");
		n3 = scan.nextInt();
		System.out.println();
		
		String mensagem = "";
		
		
		
		
		if(n1 > n2 && n1 > n3){
			
			mensagem = String.format("o %s e o numero maior.", n1);
		}
		if(n2 > n1 && n2 > n3){
			mensagem = String.format("o %s e o numero maior.", n2);
			
		}
		if(n2 > n1 && n3 > n2){
			mensagem = String.format("o %s e o numero maior.", n3);
			
		}
		if(n2==n1 && n2 == n3) {
			mensagem = String.format("%s numeros iguais.", n2);
			System.out.println();
		}
		System.out.println("|----------------------|DENTRE TODOS OS NUMEROS|----------------------|");
		System.out.println(mensagem);
	}


}
