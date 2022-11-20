import java.util.Scanner;

public class conversaoDolarEmReal {

    private static Scanner scanner = new Scanner(System.in);

    public static void rConversao(){
        double valorEmreal;
        double valorDoDolar;
        double realConvertido;

        System.out.println("+------------------------------------------------------+");
        System.out.println("|              Converter Dolar em real                 |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("Qual a cotação (Valor) atual do Dolar ?");
        valorDoDolar = scanner.nextDouble();

        while (valorDoDolar < 0){
            System.out.println("Valor invalido!!!");
            System.out.println("Qual a cotação (Valor) atual do Dolar ?");
            valorDoDolar = scanner.nextDouble();
        }

        System.out.println("Qual é o valor em dolar que deseja ser Convertido para real ?");
        valorEmreal = scanner.nextDouble();

        while (valorEmreal < 0){
            System.out.println("Valor invalido!!!");
            System.out.println("Qual é o valor em dolar que deseja ser Convertido para Real ?");
            valorEmreal = scanner.nextDouble();
        }

        realConvertido = valorEmreal / valorDoDolar;
        System.out.println("+------------------------------------------------------+");
        System.out.println("| O valor em real é: " + realConvertido);
        System.out.println("+------------------------------------------------------+");
        oFmenu.menuPronto();
    }
}
