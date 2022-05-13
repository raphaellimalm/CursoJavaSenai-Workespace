import java.util.Locale;
import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		int n1, n2;
		
		System.out.println("Digite 1º");
		n1 = scan.nextInt();
		
		System.out.println("Digite 2º");
		n2 = scan.nextInt();
		
		String mensagem = "";
		
		
		
		
		if(n1 > n2){
			
			mensagem = String.format("o %s e o numero maior.", n1);
		}
		if(n2 > n1){
			mensagem = String.format("o %s e o numero maior.", n2);
			
		}
		if(n2==n1) {
			mensagem = String.format("%s numeros iguais.", n2);
		}
		System.out.println("----------------------Sendo assim:----------------------");
		System.out.println(mensagem);
	}


}