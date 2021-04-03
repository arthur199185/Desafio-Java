import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== MENU ===");
        System.out.println("1. Consultar trecho:");
        System.out.println("2. Consultar rota:");
        System.out.println("3. Terminar o programa");
        System.out.println("\n Escolha uma das opções:");
        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();

        System.out.println("Digite o custo por KM:");
        float valorKM = leitor.nextFloat();
        CalculadoraViagem calculadora = new CalculadoraViagem(valorKM);

        if (opcao == 1){
            System.out.println("Digite a cidade origem:");
            String cidade1 = leitor.next();
            System.out.println("Digite a cidade destino:");
            String cidade2 = leitor.next();
            RetornoTrecho retornoTrecho = calculadora.consultarTrecho(cidade1, cidade2);
            System.out.println(retornoTrecho);
        }
        if
    }

}
