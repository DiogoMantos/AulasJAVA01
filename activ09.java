import java.util.Scanner;

public class activ09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //essa parte pode ser usada assim para diminuir codigo
        //double contaLuz, ai vai colocando o nome das outras variaveis
        //Digitar todos os gastos no mes da familia
        System.out.print("Digite valor da sua conta de luz: ");
        double contaDeLuz = scanner.nextDouble();

        System.out.print("Digite valor da sua conta de água: ");
        double contaAgua = scanner.nextDouble();

        System.out.print("Digite valor da sua conta de telefone: ");
        double contaDeTelefone = scanner.nextDouble();

        System.out.print("Digite o valor da escola do seu filho: ");
        double contaDaEscola = scanner.nextDouble();

        System.out.print("Digite o valor da fatura do cartão: ");
        double valorFaturaCartao = scanner.nextDouble();

        System.out.print("Digite valor gastado no supermercado do mês: ");
        double valorMercado = scanner.nextDouble();

        //para calcular todo o gasto do mes da familia
        double somaTotal = 0;
        somaTotal += contaDeLuz;
        somaTotal += contaAgua;
        somaTotal += contaDeTelefone;
        somaTotal += contaDaEscola;
        somaTotal += valorFaturaCartao;
        somaTotal += valorMercado;

        System.out.print("O valor gasto no mes pela familia foi de: " + somaTotal);

        scanner.close();
    }
}