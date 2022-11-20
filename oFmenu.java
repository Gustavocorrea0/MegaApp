import java.util.Scanner;

public class oFmenu {
    private static Scanner scanner = new Scanner(System.in);
    static boolean sistemaEstiverLigado = true;
    public static void menuPronto (){
        int opcao;
        do {
            System.out.println("+------------------------------------------------------+");
            System.out.println("|                        MagaApp                       |");
            System.out.println("+------------------------------------------------------+");
            System.out.println("| 1 - Calcular Area Da Circunferencia;                 |");
            System.out.println("| 2 - Calcular Salario Liquido de um Professor;        |");
            System.out.println("| 3 - Trocar números;                                  |");
            System.out.println("| 4 - Calcular o volume de uma caixa Retangular;       |");
            System.out.println("| 5 - Converter Dolar em Real;                         |");
            System.out.println("| 6 - Converter Real em Dolar;                         |");
            System.out.println("| 7 - Somar o quadrado de 3 números;                   |");
            System.out.println("| 8 - Calcular o valor do quadrado da soma 3 números;  |");
            System.out.println("| 9 - Calcular novo Salario;                           |");
            System.out.println("| 10 - Velocidade Do Projetil;                         |");
            System.out.println("| 11 - Sair                                            |");
            System.out.println("+------------------------------------------------------+");
            System.out.println("| Qual é a opção selecionada:                          |");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularRaioCircunferencia.areaC();
                    break;
                case 2:
                    salarioLiquidoProfessor.salario();
                    break;
                case 3:
                    trocarAEB.troca();
                    break;
                case 4:
                    volumeDaCaixaRetangular.calculoVolume();
                    break;
                case 5:
                    conversaoDolarEmReal.rConversao();
                    break;
                case 6:
                    conversaoRealEmDolar.dConversao();
                    break;
                case 7:
                    somaDoquadradoABC.somarOQuadradoDeABC();
                    break;
                case 8:
                    somarOQuadradoABC.elevarAoQuadradoASomaDeABC();
                    break;
                case 9:
                    novoSalario.salario();
                    break;
                case 10:
                    velocidadeDeUmProjetil.calculoDaVelocidade();
                    break;
                case 11:
                    sairDoSistema();
                    break;
                default:
                    System.out.println();
                    System.out.println("+------------------------------------------------------+");
                    System.out.println("|                    OPÇÃO INVÁLIDA!!!                 |");
                    System.out.println("+------------------------------------------------------+");
                    menuPronto();
                    break;

            }
        } while (opcao == 11);
    }
    private static void sairDoSistema(){
        boolean desejaContinuarForInvalido;
        String continuar;
        do {
            System.out.println("Deseja sair? [S]im / [N]ão");
            continuar = scanner.next();
            desejaContinuarForInvalido = !continuar.equalsIgnoreCase("S") && !continuar.equalsIgnoreCase("N");

            if (desejaContinuarForInvalido){
                System.out.println("Opção não listada");

            } else if (continuar.equalsIgnoreCase("s")){
                sistemaEstiverLigado = false;
                System.out.println("Saindo do MegaApp :)");
                System.exit(0);

            } else if (continuar.equalsIgnoreCase("n")) {
                sistemaEstiverLigado = true;
                oFmenu.menuPronto();
            }

        }while (desejaContinuarForInvalido);

    }
}
