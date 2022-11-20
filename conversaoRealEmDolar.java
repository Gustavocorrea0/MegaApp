import java.util.Scanner;

public class conversaoRealEmDolar {
    private static Scanner scanner = new Scanner(System.in);
    public static void dConversao(){
        double valorEmreal;
        double valorDoDolar;
        double dolarConvertido;
        System.out.println("+------------------------------------------------------+");
        System.out.println("|              Converter Real em Dolar                 |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("Qual a cotação (valor) atual do dolar ?");
        valorDoDolar = scanner.nextDouble();
        while (valorDoDolar < 0){
            System.out.println("Valor invalido!!!");
            System.out.println("Qual a cotação (Valor) atual do Dolar ?");
            valorDoDolar = scanner.nextDouble();
        }

        System.out.println("Qual é o valor em dolar que deseja ser Convertido para Real ?");
        valorEmreal = scanner.nextDouble();

        while (valorEmreal < 0){
            System.out.println("Valor invalido!!!");
            System.out.println("Qual é o valor em dolar que deseja ser Convertido para Real ?");
            valorEmreal = scanner.nextDouble();
        }

        dolarConvertido = valorEmreal * valorDoDolar;

        System.out.println("+------------------------------------------------------+");
        System.out.println("| O valor em dolar é: " + dolarConvertido);
        System.out.println("+------------------------------------------------------+");
        oFmenu.menuPronto();
    }
}
