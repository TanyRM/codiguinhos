import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        for (int i = 0; i < periodo; i++) {
          valorFinal += (valorFinal * taxaJuros);
        }
        
        System.out.printf("Valor final do investimento: R$ %.2f", valorFinal);
        
        scanner.close();
    }
}