package intros.src;

import java.util.Scanner;

public class LerDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a;
        char b;
        int c;
        double d;
        
        a = scan.nextLine();
        System.out.println(""+ a);
        
        b = scan.next().charAt(0);
        System.out.println(""+ b);
        
        c = scan.nextInt();
        System.out.println(""+ c);
        
        d = scan.nextDouble();
        System.out.println(""+ d);
    }
}
