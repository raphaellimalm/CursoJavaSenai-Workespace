
import java.util.Locale;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		int v;
		
		System.out.println("Digite os numero de vizinhos: ");
		v = sc.nextInt();
		System.out.println("");
		
		
		int x = v;
		int y = v;
		x--;
		y++;
		
		System.out.println("vizinho anterior "+x+" proximo vizinho "+y);
		
		

	}

}
