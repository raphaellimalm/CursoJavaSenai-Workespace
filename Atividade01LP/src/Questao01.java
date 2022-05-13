import java.util.Locale;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		float n1, n2;
		
		System.out.print("Digite a nota 1: ");
		n1 = scan.nextFloat();
		System.out.println();
		
		System.out.print("Digite a nota 2: ");
		n2 = scan.nextFloat();
		System.out.println();
		
		float media = (n1+n2)/2;
		System.out.println("************************|SUA MEDIA FINAL|************************");
		System.out.println();
		System.out.println(media);

	}

}
