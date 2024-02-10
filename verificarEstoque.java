package informeNecessidadeReporEstoque;

public class verificarEstoque {

	public static void main(String[] args) {
		Estoque produto = new Estoque();
		produto.nome = "smartphone";
		produto.qtd = 6;
		produto.valor = 500.0;
		
		exibirQuantidadeEmEstoque(produto);
	}
	static void exibirQuantidadeEmEstoque(Estoque produto){
		if(produto.qtd <= 10){
			System.out.println("Tem que repor o estoque do:" + produto.nome);
		}else{
			System.out.println("Nao precisa repor estoque do:" + produto.nome);
		}
		System.out.println("Quantidade em estoque do produto: " + produto.nome + " é de " + produto.qtd + " unidade(s)" + " e valor é: " + produto.valor);
	}
}
