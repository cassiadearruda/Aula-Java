package Programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classes.Produto;

public class ExeProduto {

	public static void main(String[] args) {
		
		//OBJETOS
		Scanner leia = new Scanner (System.in);
		List <Produto> loja = new ArrayList <>();
		List <Produto> carrinho = new ArrayList <>();
		
		//VARIÁVEIS
		char op;
		int x = 0;
		String y = "";
		
		String codigo = "";
		String nome = "";
		double preco = 0.0;
		int estoque = 0;
		String auxCod = "";
		int auxQntd = 0;
		
		//ENTRADAS
		loja.add(new Produto (codigo = "G7-01", nome = "Cássia", preco = 55.45, estoque = 10));
		loja.add(new Produto (codigo = "G7-02", nome = "Anderson", preco = 51.45, estoque = 10));
		loja.add(new Produto (codigo = "G7-03", nome = "Cássia", preco = 55.45, estoque = 10));
		loja.add(new Produto (codigo = "G7-04", nome = "Cássia", preco = 55.45, estoque = 10));
		loja.add(new Produto (codigo = "G7-05", nome = "Cássia", preco = 55.45, estoque = 10));
		loja.add(new Produto (codigo = "G7-06", nome = "Cássia", preco = 55.45, estoque = 10));
		loja.add(new Produto (codigo = "G7-07", nome = "Cássia", preco = 55.45, estoque = 10));
		loja.add(new Produto (codigo = "G7-08", nome = "Cássia", preco = 55.45, estoque = 10));
		loja.add(new Produto (codigo = "G7-09", nome = "Cássia", preco = 55.45, estoque = 10));
		loja.add(new Produto (codigo = "G7-10", nome = "Cássia", preco = 55.45, estoque = 10));
		
		carrinho.add(new Produto (codigo = "", nome = "", preco = 0.0, estoque = 0));
		carrinho.add(new Produto (codigo = "", nome = "", preco = 0.0, estoque = 0));
		carrinho.add(new Produto (codigo = "", nome = "", preco = 0.0, estoque = 0));
		carrinho.add(new Produto (codigo = "", nome = "", preco = 0.0, estoque = 0));
		carrinho.add(new Produto (codigo = "", nome = "", preco = 0.0, estoque = 0));
		carrinho.add(new Produto (codigo = "", nome = "", preco = 0.0, estoque = 0));
		carrinho.add(new Produto (codigo = "", nome = "", preco = 0.0, estoque = 0));
		carrinho.add(new Produto (codigo = "", nome = "", preco = 0.0, estoque = 0));
		carrinho.add(new Produto (codigo = "", nome = "", preco = 0.0, estoque = 0));
		carrinho.add(new Produto (codigo = "", nome = "", preco = 0.0, estoque = 0));

		//GERADOR DE TABELA
		for (Produto conta : loja) {
			System.out.print(conta.getCodigo()+" "+conta.getNome()+" "+conta.getPreco()+" "+conta.getEstoque()+"\n");
		}	
		
		//ADICIONAR NO CARRINHO
		System.out.println("DIGITE O CÓDIGO DO PRODUTO: ");
		auxCod = leia.next().toUpperCase();
		System.out.println("DIGITE A QUANTIDADE QUE DESEJA: ");
		auxQntd = leia.nextInt();
		
		for (Produto conta : loja) {
			for (Produto quant : carrinho) {
				if (auxCod.equals(conta.getCodigo()))
				{	
					conta.setEstoque(estoque - auxQntd);
					System.out.print(conta.getCodigo()+" "+conta.getNome()+" "+conta.getPreco()+" "+conta.getEstoque()+"\n");
					quant.setCodigo(conta.getCodigo());
					quant.setNome(conta.getNome());
					quant.setPreco(conta.getPreco());
					quant.setPreco(auxQntd);
				}
			}	
		}
		//System.out.print(carrinho.));
	}
}
