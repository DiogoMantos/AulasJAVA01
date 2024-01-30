import java.util.Scanner;

public class activ11remak{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a sua nota na materia de portugues: ");
        double notaPortugues = scanner.nextDouble();
        
        System.out.print("Digite sua nota em matematica: ");
        double notaMatematica = scanner.nextDouble();
        
        if(notaPortugues + notaMatematica >= 150){
            System.out.print("Você foi aprovado! Parabens você conseguiu passar: ");
        }else{
            System.out.print("Você não foi aprovado tente na proxima! ");
        }
        
    }
}