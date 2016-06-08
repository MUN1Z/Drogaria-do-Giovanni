package model;

import java.util.ArrayList;

public class Cliente extends Pessoa{
	private ArrayList<Pedido> historicoCompras;

	public Cliente(String nome, String cpf, String endereco, String telefone) {
            super(nome, cpf, endereco, telefone);
            historicoCompras = new ArrayList<Pedido>();
	}
	
	public void adicionarPedido(Pedido pedido) {
		historicoCompras.add(pedido);
	}
	
	
}
