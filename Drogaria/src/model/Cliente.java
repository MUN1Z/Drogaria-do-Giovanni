package model;

import java.util.ArrayList;

public class Cliente extends Pessoa{
	private ArrayList<Pedido> historicoCompras = new ArrayList<Pedido>();

	public Cliente(String nome, String cpf, String endereco, String telefone) {
		super(nome, cpf, endereco, telefone);
	}
	
	public void adicionarPedido(Pedido pedido) {
		historicoCompras.add(pedido);
	}
	
	
}
