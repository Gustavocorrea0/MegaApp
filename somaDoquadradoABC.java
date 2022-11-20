import java.util.Scanner;

public class somaDoquadradoABC {
    private static Scanner scanner = new Scanner(System.in);
    public static void somarOQuadradoDeABC() {
        int a;
        int b;
        int c;
        int valorDoQuadrado;
        System.out.println("+------------------------------------------------------+");
        System.out.println("|           Somar o quadrado de A , B e C              |");
        System.out.println("+------------------------------------------------------+");
        System.out.println();
        System.out.println("Qual é o numero de A");
        a = scanner.nextInt();
        System.out.println("Qual é o numero de B");
        b = scanner.nextInt();
        System.out.println("Qual é o numero de C");
        c = scanner.nextInt();

        a = a * a;
        b = b * b;
        c = c * c;
        valorDoQuadrado = a + b + c;
        System.out.println("+------------------------------------------------------+");
        System.out.println("O valor da soma do quadrado de A, B e C é " + valorDoQuadrado);
        System.out.println("+------------------------------------------------------+");
        oFmenu.menuPronto();
    }
}
