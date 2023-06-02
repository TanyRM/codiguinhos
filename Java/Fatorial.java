import java.util.Scanner;

public class Main{
    public static int fat(int n){
        if (n==0)
            return 1;
        else 
            return n*fat(n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int total = fat(n);   
        System.out.println(""+total);
    }
}
