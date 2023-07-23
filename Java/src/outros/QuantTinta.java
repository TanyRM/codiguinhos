package outros;
import java.util.Scanner;

public class QuantTinta {
  public static void main(String[] args){
    int litros, metros;
    double galoes, latas, gl; //galoes=3,6l e latas=18l
    double valorg = 25.00, valorl = 80.00, valor;
    Scanner scan = new Scanner(System.in);
    char op;

    do{
      System.out.println("Qual o tamanho da area a ser pintada?");
      metros = scan.nextInt();
  
      int percen = (10/100)*metros; 
      litros = (metros/6)+percen;
      latas = litros/18;
      valorl *= latas;
      galoes = litros/3.6;
      valorg *= galoes;
      gl = litros/18+((litros%18)/3.6);
      valor = Math.floor(litros/18)*80.00 + ((litros%18)/3.6)*25.00;
      
      System.out.printf("Devem ser comprados %d litros\n",litros);
      System.out.printf("Latas: %d\t %.2f\n", Math.round(latas),valorl);
      System.out.printf("Galões: %d\t %.2f\n",Math.round(galoes),valorg);
      System.out.printf("Latas: %d galões: %d\t %.2f\n",litros/18, Math.round(((litros%18)/3.6)),valor);
  
      System.out.println("\nDeseja ver outro tamanho?");
      op = scan.next().charAt(0);
    } while(op=='s' || op=='S');
  }  
}
