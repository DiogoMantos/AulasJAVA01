public class activ{
    public static void main(String[] args){

        int numero = 4;
        
        //aqui ele irar contar de 1 a 30 e ver qual desses numeros sao multiplos de tres
        for(int i = 1; i < 30; i++ ){
            //onde verificara se o numero e dividido por 3
            if (i % numero == 0){
                System.out.println(i + " É multiplo de " + numero);
                
            }
        }

    }
}