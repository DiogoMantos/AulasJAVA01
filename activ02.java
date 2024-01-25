import java.util.Scanner;
public class activ02 {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //onde ele digitara o nuemro
        System.out.println("Digite o numero para ver o dobro dele");
        int num = scanner.nextInt();
        
        //onde acontecera o calculo para tornalo o dobro
        int soma = (num*num);
        System.out.println("o dobro do seu nuemro é: " + soma);
    }
}