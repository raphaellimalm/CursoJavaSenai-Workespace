import java.util.Locale;
import java.util.Scanner;

public class Questao03{

	public static void main(String[] args) {

			
			Scanner scan = new Scanner(System.in);
			scan.useLocale(Locale.US);
			String nome;
			
			System.out.print("Digite seu nome: ");
			nome = scan.nextLine();
			System.out.println();
			
			String n= String.format("Ola %s! \n",nome);
		
		System.out.println(n);
	}

	}

