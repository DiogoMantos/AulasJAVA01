//onde tudo começa o codigo
import java.util.Scanner;
public class activ01 {
    
    //onde você vai falar como vai ser de leitura ou de numero
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    //digitar peso    
        System.out.print("Digite seu peso em quilogramasa: ");
        double peso = scanner.nextDouble();
        
    //digitar sua altura
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();
        
    //calcular o imc
        double imc = peso /(altura*altura);
        
        System.out.println("O imc é: " +imc);
        
    if (imc < 18.5){
        System.out.println("Abaixo do peso");
    }else if(imc >= 18.5 && imc <25){
        System.out.println("Peso Normal");
    }else if (imc >= 25 && imc < 30){
    System.out.println("Sobrepeso");
    } else{
        System.out.println("obesidade");
    }
  }
}