import java.util.Scanner;

public class activ16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefasImportantes = new String[]{"Curso", "Escola", "Limpar a casa", "Estudar"};

        System.out.println("Escolha a tarefa que primeiro ira fazer:");

        for(int i = 0; i < tarefasImportantes.length; i++){
            System.out.println("[" + i + "]" + tarefasImportantes[i]);
        }
        System.out.print("Digite o numero referente a tarefa: ");
        Integer tarefaEscolhida = scanner.nextInt();

        System.out.println("Você escolheu o sabor: " + tarefasImportantes[tarefaEscolhida]);

        scanner.close();
    }

}