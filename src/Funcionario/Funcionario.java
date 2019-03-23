package Funcionario;

public class Funcionario {
	
	private String nome;
	
	private double salario;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSalarioString() {
		StringBuilder str = new StringBuilder();
		str.append(salario);
		return str.toString();
	}
	public double getSalario() {
		return salario;
	}
	


	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double addAumento(double valor) {
		salario+=valor;
		return this.salario+valor;
	}
	
	public double calculoSalarioAnual() {
		return salario*12;
	}
	
	public String mostrarDados() {
		
		StringBuilder msg = new StringBuilder();
		msg.append("<html>");
		msg.append("Nome: ");
		msg.append(this.nome);
		msg.append("<br/>");
		msg.append("Salario Anual: ");
		msg.append(this.calculoSalarioAnual());
		msg.append("<br/>");
		msg.append("Salario:");
		msg.append(this.salario);
		msg.append("</html>");
		return msg.toString();
		
	}


}
