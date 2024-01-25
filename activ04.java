//saber se o aluno passo ou nao passo na escola
import java.util.Scanner;
public class activ04 {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Ola, como vai " + nome);
        
        System.out.print("Digite as quatro notas dos alunos: ");
        double av1 = scanner.nextDouble();
        double av2 = scanner.nextDouble();
        double av3 = scanner.nextDouble();
        double av4 = scanner.nextDouble();
        
        double soma = (av1 + av2 + av3 + av4) / 4;
        System.out.print("a soma das suas notas é: " + soma);
        
         if (soma >= 6.0) {
            System.out.println(" Aluno aprovado!");
        } else {
            System.out.println( "Aluno reprovado.");
        }

        scanner.close();  
    }
    
}