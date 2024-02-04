public class activ17{
    public static void main(String[] args) {
        
        Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
        Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
        Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
        Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };
        
        Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
        System.out.println("Primeira semana faturamento do dia 1°: " + mes[0][4]);
        
        double maiorFaturamneto = 0;
        double semanaMaiorFaturamento= -1;

    for(int semana = 0; semana < mes.length; semana++){
        int faturamentoSemanaAtual = 0;
        
        for(int dia = 0; dia < mes[semana].length; dia++){
            faturamentoSemanaAtual += mes[semana][dia];
        }

        if(faturamentoSemanaAtual > maiorFaturamneto){
            maiorFaturamneto = faturamentoSemanaAtual;
            semanaMaiorFaturamento = semana + 1;
        }

    }
    if (semanaMaiorFaturamento != -1) {
        System.out.println("A semana com o maior faturamento foi a semana: " + semanaMaiorFaturamento);
        System.out.println("O faturamento foi de R$ " + maiorFaturamneto);
    }else{
        System.out.println("Não há dados de faturamento para analisar.");
    }

    }

}