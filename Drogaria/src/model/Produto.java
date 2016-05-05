package model;

public class Produto {
	private String nome, fabricante, fornecedor;
	private double valorUnitario;
	private int quantidadeEstoque;
	
	public Produto(String nome, String fabricante, String fornecedor, double valorUnitario, int quantidadeEstoque) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.fornecedor = fornecedor;
		this.valorUnitario = valorUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public int getQuantidadeEstoque(){
		return this.quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int quant){
		this.quantidadeEstoque = quant;
	}
	
}
