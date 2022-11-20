import java.util.Scanner;
public class novoSalario {
    private static Scanner scanner = new Scanner(System.in);
    public static void salario(){
        double SM; //Salario mensal
        double PR; //Percentual de Reajuste
        double NS; //Novo Salario
        double aumento;
        System.out.println("+------------------------------------------------------+");
        System.out.println("|Calcular o novo salario após o percentual de Reajuste |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("Qual é o seu salario atual ?");
        SM = scanner.nextDouble();
        while (SM < 0){
            System.out.println("Salario negativo Invalido");
            System.out.println("Qual é o seu salario atual ?");
            SM = scanner.nextDouble();
        }

        System.out.println("Qual foi o percentual de Reajuste ?");
        PR = scanner.nextDouble();
        while (PR < 0){
            System.out.println("Rejuste invalido");
            System.out.println("Qual foi o percentual de Reajuste ?");
            PR = scanner.nextDouble();
        }

        aumento = (SM * PR) / 100;
        NS = SM + aumento;
        System.out.println("+------------------------------------------------------+");
        System.out.println("| O seu novo salario é: R$: " + NS);
        System.out.println("+------------------------------------------------------+");
        oFmenu.menuPronto();
    }

}
