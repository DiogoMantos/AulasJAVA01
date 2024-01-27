import java.util.Scanner;

public class activ08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Digitar valor do produto
        System.out.print("Digite valor do produto desejado: ");
        double valorProduto = scanner.nextDouble();

        //varial do valor do frete
        double valorFrete = 15.00;
        //variavel do valor final 
        double valorFinal;

        //onde o codigo ver se o compra passo de 100 ou nao 
        // e cobra o frete
        if (valorProduto >= 20.00) {
            valorFinal = valorProduto;
        }else{
            valorFinal = valorProduto + valorFrete;
        }

        System.out.println("O valor final da compra é: " +  valorFinal);


        scanner.close();
    }
}