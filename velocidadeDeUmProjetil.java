import java.util.Scanner;
//TESTAR DE VELOCIDADE É NEGATIVA E ESPAÇO também
public class velocidadeDeUmProjetil {
    private static Scanner scanner = new Scanner(System.in);

    public static void calculoDaVelocidade() {
        float distancia;
        float tempo;
        float velocidade;
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Calcular a Velocidade de um Projetil                 |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("Qual foi a Distância percorrida pelo Projétil em metros ?");
        distancia = scanner.nextFloat();

        while (distancia < 0){
            System.out.println("Distancia Inválida");
            System.out.println("Qual a Distancia percorrida pelo Projétil");
            distancia = scanner.nextFloat();
        }

        System.out.println("Qual foi o Tempo que o projétil levou para chegar ao ponto em minutos?");
        tempo = scanner.nextFloat();

        while (tempo < 0){
            System.out.println("Tempo inválido");
            System.out.println("Qual foi o Tempo que o projétil levou para chegar ao ponto em minutos?");
            tempo = scanner.nextFloat();
        }

        velocidade = (distancia * 1000)/(tempo * 60);
        System.out.println("A velocidade foi de " + velocidade + " KM/H");
        oFmenu.menuPronto();
    }
}
