import java.util.Scanner;
public class activ05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Digitar valor do produto
        System.out.print("Digite o valor do produto: ");
        Double ValorProduto = scanner.nextDouble();
        
        //para ser a quantidade que o cliente deseja
        System.out.print("Digite a quantidade: ");
        Double QtdProduto = scanner.nextDouble();

        //calcular subtotal
        double subtotal = ValorProduto * QtdProduto;

        //verificar a quantidade para aplicar o desconto
        if (QtdProduto > 10) {
            //calcular o desconto de 10%
            double percentualDesconto = 10;
            double valorDesconto = (percentualDesconto / 100) * subtotal;
            subtotal -= valorDesconto;
        }

        //calcula o valor total final no console
        System.out.print("valor total fonal: R$%.2f%n", valorTotal);

               scanner.close();
    }
}