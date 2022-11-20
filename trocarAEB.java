import java.util.Scanner;
public class trocarAEB {
    private static Scanner scanner = new Scanner(System.in);
    public static void troca(){

        int A;
        int B;
        System.out.println("+------------------------------------------------------+");
        System.out.println("|                   Troca de valores                   |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("Qual é o valor de A: ");
        A = scanner.nextInt();
        System.out.println("Qual é o valor de B: ");
        B = scanner.nextInt();

        int troca = A;
        A = B;
        B = troca;
        System.out.println("+------------------------------------------------------+");
        System.out.println("- Valor de A: " + A);
        System.out.println("- Valor de B: " + B);
        System.out.println("+------------------------------------------------------+");

        oFmenu.menuPronto();
    }
}
