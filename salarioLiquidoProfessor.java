import java.util.Scanner;

public class salarioLiquidoProfessor {
    public static Scanner scanner = new Scanner(System.in);
    public static void salario(){
        int hT; //horas trabalhadas
        double vH; //valor das horas
        double pD; //percentual de desconto
        double tD; //total de desconto
        double sB; //salario bruto
        double sL; //salario liquido
        System.out.println("+------------------------------------------------------+");
        System.out.println("|       Calculo de salario Liquido de Professor        |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("Quantas horas aula você possui este mês ?");
        hT = scanner.nextInt();
        while (hT < 0){
            System.out.println("Hora invalida");
            System.out.println("Quantas horas aula você possui este mês ?");
            hT = scanner.nextInt();
        }

        System.out.println("Qual é o valor de sua hora aula?");
        vH = scanner.nextDouble();
        while (vH < 0){
            System.out.println("Valor invalida");
            System.out.println("Qual é o valor de sua hora aula?");
            vH = scanner.nextDouble();
        }
        System.out.println("Qual é o seu percentual de desconto ?");
        pD = scanner.nextDouble();
        while (pD < 0){
            System.out.println("Percentual inválido");
            System.out.println("Qual é o seu percentual de desconto ?");
            pD = scanner.nextDouble();
        }
        sB = hT * vH;  //calculo de salario bruto
        tD = (sB * pD) / 100;  //calculo de desconto
        sL = sB - tD; //calculo de salario Liquido
        System.out.println("+------------------------------------------------------+");
        System.out.println("- Seu salario bruto é: " + sB + "                      ");
        System.out.println("- São descontados " + tD + " reais                     ");
        System.out.println("- Seu Salario Liquido é: " + sL + "                    ");
        System.out.println("+------------------------------------------------------+");

        oFmenu.menuPronto();

    }
}
