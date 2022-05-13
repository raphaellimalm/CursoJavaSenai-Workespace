import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {

		Scanner meuScanner = new Scanner(System.in);
		meuScanner.useLocale(Locale.US);
		System.out.print("Digite Sua Idade:");
		int idade = meuScanner.nextInt();
		System.out.print("Idade:" + idade);
		System.out.println();

		System.out.print("Digie seu sexo:");
		String sexo = meuScanner.next();
		System.out.println("Sexo: " + sexo);
		System.out.print("Digite sua Altura:");
		float altura = meuScanner.nextFloat();
		System.out.println();
		System.out.println("Seus dados serão: " + idade + " anos," + " tendo " + altura + " de altura " + "e sendo do sexo " + sexo);

		meuScanner.close();
	}

}
