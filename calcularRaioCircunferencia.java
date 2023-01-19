import java.util.Scanner;

public class calcularRaioCircunferencia {
    private static Scanner scanner = new Scanner(System.in);

    public static void areaC(){
       double pi = 3.14159265;
       double a; //resultado
       double raio;

        System.out.println("+----------------------------------------------------+");
        System.out.println("|        Calcular a area de uma Circunferência       |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("Qual é o raio da circunferencia ?");
        raio = scanner.nextDouble();
        while (raio < 0){
            System.out.println("+------------------------------------------+");
            System.out.println("|            Número invalido!!!            |");
            System.out.println("+------------------------------------------+");
            System.out.println("| Qual é o raio da circunferencia em metros?");
            raio = scanner.nextDouble();
        }

        a = pi * (raio*raio); //formula
        System.out.println("+----------------------------------------------------+");
        System.out.println("|A área da circunferencia é igual a: " + a + " metros|");
        System.out.println("+----------------------------------------------------+");
        oFmenu.menuPronto();
    }
}
