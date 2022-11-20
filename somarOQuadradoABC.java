import java.util.Scanner;

public class somarOQuadradoABC {
    private static Scanner scanner = new Scanner(System.in);
    public static void elevarAoQuadradoASomaDeABC() {
        int a;
        int b;
        int c;
        int valorDaSoma;
        int valorAoQuadrado;
        System.out.println("+------------------------------------------------------+");
        System.out.println("Somar o quadrado de A , B e C");
        System.out.println("+------------------------------------------------------+");
        System.out.println("Qual é o numero de A");
        a = scanner.nextInt();
        System.out.println("Qual é o numero de B");
        b = scanner.nextInt();
        System.out.println("Qual é o numero de C");
        c = scanner.nextInt();

        a = a + a;
        b = b + b;
        c = c + c;

        a = a * a;
        b = b * b;
        c = c * c;

        valorDaSoma = a + b + c;
        valorAoQuadrado = valorDaSoma * valorDaSoma;
        System.out.println("+------------------------------------------------------+");
        System.out.println("A soma do quadrado de A, B e C é " + valorAoQuadrado);
        System.out.println("+------------------------------------------------------+");

        oFmenu.menuPronto();
    }
}
