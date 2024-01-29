import java.util.Scanner;
public class activ10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade para saber se você tem idade para se aposentar: ");
        double idade = scanner.nextDouble();

        System.out.print("Digite a quantidade de tempo que contriuibuio contribuido para saber mos se você pode se aposentar: ");
        double tempoDeContribuicao = scanner.nextDouble();

        if(idade >= 55 || tempoDeContribuicao >=25){
            System.out.print("Você está apto para se aposentar: ");
        }else{
            System.out.print("Você não está apto ainda para se aposentar: ");
        }


    }
}