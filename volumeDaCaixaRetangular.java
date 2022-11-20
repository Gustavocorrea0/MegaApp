import java.util.Scanner;

public class volumeDaCaixaRetangular {
    private static Scanner scanner = new Scanner(System.in);
    public static void calculoVolume(){
        int escolha;

        System.out.println("Calculo do volume de uma Caixa Retangular");

        System.out.println("Digite 1 para Calcular em metros e 2 para calcular em centimetros: ");
        escolha = scanner.nextInt();
        do {
            switch (escolha) {
                case 1:
                    calcularEmMetros();
                    break;
                case 2:
                    calcularEmCentimetros();
                    break;
                case 3:
                    System.out.println("Voltando ao menu");
                    oFmenu.menuPronto();
                    break;
                default:
                    System.out.println("+----------------+");
                    System.out.println("| Opção Invalida |");
                    System.out.println("+----------------+");
                    calculoVolume();
                    break;
            }
        }while (escolha == 3);

    }

    private static void calcularEmCentimetros(){
        double comprimento;
        double largura;
        double altura;
        double volume;
        System.out.println("+------------------------------------------------------+");
        System.out.println("|         Qual é o Comprimento da Caixa em metros?     |");
        System.out.println("+------------------------------------------------------+");
        comprimento = scanner.nextDouble();
        while (comprimento < 0){
            System.out.println("Comprimento invalido");
            System.out.println("Qual é o Comprimento da Caixa em metros?");
            comprimento = scanner.nextDouble();
        }
        System.out.println("Qual é a largura da Caixa em metros ?");
        largura = scanner.nextDouble();
        while (largura < 0){
            System.out.println("Comprimento invalida");
            System.out.println("Qual é o valor em dolar que deseja ser Convertido para Real ?");
            largura = scanner.nextDouble();
        }
        System.out.println("Qual é a altura da Caixa em metros ?");
        altura = scanner.nextDouble();
        while (altura < 0){
            System.out.println("Comprimento invalido");
            System.out.println("Qual é o valor em dolar que deseja ser Convertido para Real ?");
            altura = scanner.nextDouble();
        }
        volume = comprimento * largura * altura;
        System.out.println("+------------------------------------------------------+");
        System.out.println("O volume da Caixa é : " + volume + " Metros quadrados"   );
        System.out.println("+------------------------------------------------------+");
        oFmenu.menuPronto();
    }

    private static void calcularEmMetros(){
        double comprimento;
        double largura;
        double altura;
        double volume;

        System.out.println("Qual é o Comprimento da Caixa em metros?");
        comprimento = scanner.nextDouble();
        while (comprimento < 0){
            System.out.println("Comprimento invalido");
            System.out.println("Qual é o Comprimento da Caixa em metros?");
            comprimento = scanner.nextDouble();
        }
        System.out.println("Qual é a largura da Caixa em metros ?");
        largura = scanner.nextDouble();

        while (largura< 0){
            System.out.println("Largura Invalida");
            System.out.println("Qual é a largura da Caixa em metros ?");
            largura = scanner.nextDouble();
        }
        System.out.println("Qual é a altura da Caixa em metros ?");
        altura = scanner.nextDouble();
        while (altura < 0){
            System.out.println("Altura invalida");
            System.out.println("Qual é a altura da Caixa em metros ?");
            altura = scanner.nextDouble();
        }

        volume = comprimento * largura * altura;
        System.out.println("+------------------------------------------------------+");
        System.out.println("| O volume da Caixa é : " + volume + " Centimetros quadrados");
        System.out.println("+------------------------------------------------------+");
        oFmenu.menuPronto();
    }
}
