package desafio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		
		if (valor%2 == 0) {
			System.out.println("O número inserido é par!");
		}
		else {
			System.out.println("O número inserido é ímpar!");
		}
		scan.close();
	}
}
