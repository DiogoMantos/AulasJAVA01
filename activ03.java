import java.util.Scanner;
public class activ03 {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Para digitar seu primeiro nome 
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        //para digitar seu sobre nome
        System.out.print("Digite seu sobre nome ");
        String sobre = scanner.nextLine();
        
        System.out.println("Olá, como você está " + nome + " " + sobre);
        
    }
}