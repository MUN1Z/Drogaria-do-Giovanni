package model;

public class Funcionario extends Pessoa{
	private double salarioBase, comissao;

	public Funcionario(String nome, String cpf, String endereco, String telefone, double salarioBase) {
		super(nome, cpf, endereco, telefone);
		this.salarioBase = salarioBase;
	}

	public void setComissao(double valor){
		comissao += valor;
	}
	
	public double salario(){
		return salarioBase + comissao;
	}

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }
	
	
	
}
