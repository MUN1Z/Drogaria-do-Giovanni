package model;

import java.util.HashMap;

public class Pedido {
	private HashMap<Produto, Integer> produtos = new HashMap<Produto, Integer>();
	private Funcionario funcionario;
	private Cliente cliente;
	private double total;
	
	
	public Pedido(Funcionario funcionario, Cliente cliente) {
		this.funcionario = funcionario;
		this.cliente = cliente;
		total = 0;
	}
	
	public Boolean adicionarProduto(Produto produto, int quantidade){
		
		if(produto.getQuantidadeEstoque() >= quantidade){
			
		    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
		    total += (produto.getValorUnitario() * quantidade);
		
		    if (produtos.containsKey(produto)){
		    	quantidade += produtos.get(produto);
		    	produtos.replace(produto, quantidade);
		    }
		    else {
			    produtos.put(produto, quantidade);
		    }
		    return true;
		}else{
			return false;
		}
	}
		
	public void finalizar(){
		funcionario.setComissao(0.1*total);
		cliente.adicionarPedido(this);
	}
	
	public double getTotal(){
		return this.total;
	}
	
	
}
